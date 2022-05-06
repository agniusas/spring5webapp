package guru.springframework.spring5webapp.model;

import lombok.*;

import java.util.Set;

public @Data class  Book {
    private String title;
    private String isbn;
    private Set<Author> authors;
}
