package br.com.handora.zup.handora.entities;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    @Length(max = 200)
    private String title;

    @Column(nullable = false)
    @Length(max = 4000)
    private String description;


    private LocalDate publishDate;

    @Column(nullable = false)
    private String isbn;

    @Deprecated
    public Livro() {
    }

    public Livro(String title, String description, LocalDate publishDate, String isbn) {
        this.title = title;
        this.description = description;
        this.publishDate = publishDate;
        this.isbn = isbn;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public String getIsbn() {
        return isbn;
    }
}
