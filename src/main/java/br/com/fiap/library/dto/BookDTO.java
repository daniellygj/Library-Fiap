package br.com.fiap.library.dto;

import br.com.fiap.library.entity.Book;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

public class BookDTO {

    public BookDTO(Book book) {
        this.title = book.getTitle();
        this.pageQty = book.getPageQty();
        this.isbn = book.getIsbn();
        this.price = book.getPrice();
        this.releaseDate = book.getReleaseDate();
        this.author = book.getAuthor();
    }

    public BookDTO() {
    }

    private String title;

    private Integer pageQty;

    private String isbn;

    private BigDecimal price;

    private ZonedDateTime releaseDate;

    private String author;

    public Integer getPageQty() {
        return pageQty;
    }

    public void setPageQty(Integer pageQty) {
        this.pageQty = pageQty;
    }

    public ZonedDateTime getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(ZonedDateTime releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
