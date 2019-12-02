package com.brain.book.library.model;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public enum GenreEnum {
    ROMAN,
    FANTAZY,
    DETECTIVE;

    @Column(name = "genre", nullable = false)
    @Enumerated(EnumType.STRING)
    private GenreEnum genre;
}

