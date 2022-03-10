package br.com.fiap.library.entity;

import br.com.fiap.library.dto.BookDTO;
import br.com.fiap.library.dto.NewBookDTO;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.ZonedDateTime;

@Entity
@Table(name = "book")
public class Book {

    public Book(NewBookDTO book) {
        this.title = book.getTitle();
        this.pageQty = book.getPageQty();
        this.isbn = book.getIsbn();
        this.price = book.getPrice();
        this.releaseDate = book.getReleaseDate();
        this.author = book.getAuthor();
        this.creationDate = book.getCreationDate();
        this.updateDate = book.getUpdateDate();
    }

    public Book() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private Integer pageQty;

    private String isbn;

    private BigDecimal price;

    private ZonedDateTime releaseDate;

    private String author;

    private ZonedDateTime creationDate;

    private ZonedDateTime updateDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPageQty() {
        return pageQty;
    }

    public void setPageQty(Integer pageQty) {
        this.pageQty = pageQty;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public ZonedDateTime getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(ZonedDateTime releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public ZonedDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(ZonedDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public ZonedDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(ZonedDateTime updateDate) {
        this.updateDate = updateDate;
    }
}
