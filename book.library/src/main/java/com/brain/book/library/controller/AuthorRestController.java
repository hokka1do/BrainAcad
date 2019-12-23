package com.brain.book.library.controller;

import com.brain.book.library.dao.AuthorRepository;
import com.brain.book.library.model.Author;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/authors")
public class AuthorRestController {

    private final AuthorRepository authorRepository;

    public AuthorRestController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @GetMapping
    public ResponseEntity<Iterable<Author>> getAuthorList() {
        return new ResponseEntity<>(authorRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Author> getAuthor(@PathVariable Long id) {
        return new ResponseEntity<>(authorRepository.findById(id).orElse(null), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Author> removeAuthor(@PathVariable Long id) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Author> createAuthor(@RequestBody Author author) {
        Author savedAuthor = authorRepository.save(author);
        return new ResponseEntity<>(savedAuthor, HttpStatus.OK);
    }

    @PostMapping("{id}")
    public ResponseEntity<Author> updateAuthor(@RequestBody Author author) {
        Author updatedAuthor = authorRepository.save(author);
        return new ResponseEntity<>(updatedAuthor, HttpStatus.OK);

    }
}
