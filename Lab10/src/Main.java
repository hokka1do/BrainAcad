/**
 * Created by Brainacad2 on 04.09.2019.
 */
public class Main {
    public static void main(String[] args) {
        Library library1 = new Library("My favourite");
        for (int i = 0; i < Library.getFilms().length; i++) {
            if (Library.getFilms()[i] == null) {
                Library.getFilms()[i] = new Film("Film"+i,(int)Math.random(), Film.GENRE_COMEDY);
            } else if (Library.getFilms()[Library.getFilms().length - 1] != null) {
                break;
            }
        }
        System.out.println("Лимит достигнут");
    }
}