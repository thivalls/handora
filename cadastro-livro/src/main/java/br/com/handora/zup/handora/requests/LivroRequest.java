package br.com.handora.zup.handora.requests;

import br.com.handora.zup.handora.entities.Livro;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Positive;
import java.time.LocalDate;

public class LivroRequest {

    @Length(max = 200)
    @NotBlank
    private String title;

    @Length(max = 4000)
    @NotBlank
    private String description;

    @NotNull
    @Past
    private LocalDate publishDate;

    @Positive
    @NotNull
    private String isbn;

    @Deprecated
    public LivroRequest() {
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Livro toModel() {
        return new Livro(title, description, publishDate, isbn);
    }

    @Override
    public String toString() {
        return "LivroRequest{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", publishDate=" + publishDate +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
