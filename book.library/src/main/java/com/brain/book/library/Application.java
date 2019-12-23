package com.brain.book.library;

import com.brain.book.library.model.Author;
import com.brain.book.library.model.Book;
import com.brain.book.library.model.GenreEnum;
import com.brain.book.library.service.BookLibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.time.LocalDate;
import java.time.Year;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class Application {

    @Autowired
    private BookLibraryService bookLibraryService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void run() {
        addTestRoman();
        addTestFantasy();
        printAuthorBooks();
        printFilteredBooks();
    }

    private void addTestRoman() {
        Book book = new Book();
        book.setBooking("Подвал на улице Ленина");
        book.setName("Армено и жилетта");
        book.setPagesCount(320);
        book.setReleaseDate(Year.of(2015));
        book.setGenre(GenreEnum.ROMAN);
        Author author = new Author();
        author.setName("Innokentiu");
        author.setSecondName("Pedrosovich");
        author.setLastName("Petushkov");
        author.setBirthDate(LocalDate.of(1990, 4, 20));
        book.setAuthor(author);
        bookLibraryService.addNewBook(book);
    }

    private void addTestFantasy() {
        Book book = new Book();
        book.setBooking("Крыша на крыше поехала быстро");
        book.setName("Пластелин конец");
        book.setPagesCount(684);
        book.setReleaseDate(Year.of(2004));
        book.setGenre(GenreEnum.FANTAZY);
        Author author = bookLibraryService.findAuthorByFullName("Innokentiu", "Pedrosovich", "Petushkov");
        book.setAuthor(author);
        bookLibraryService.addNewBook(book);
    }

    private void printAuthorBooks() {
        List<Book> books = bookLibraryService.findBooksByAuthor("Innokentiu", "Pedrosovich", "Petushkov");
        books.forEach(System.out::println);
    }

    private void printFilteredBooks() {
        Set<GenreEnum> genres = new HashSet<>();
        genres.add(GenreEnum.ROMAN);
        genres.add(GenreEnum.FANTAZY);

        List<Book> books = bookLibraryService.findBooksByGenres(genres);
        books.forEach(System.out::println);
    }

}
