package br.com.fiap.library.controller;

import br.com.fiap.library.dto.BookDTO;
import br.com.fiap.library.dto.NewBookDTO;
import br.com.fiap.library.dto.NewPriceDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("books")
public class LibraryController {

    List<BookDTO> bookDTOList = new ArrayList<>();

    public LibraryController() {
        BookDTO bookDTO = new BookDTO();
        bookDTO.setIsbn("1");
        bookDTO.setTitle("Learning Spring");
        bookDTO.setPrice(BigDecimal.valueOf(23));
        bookDTO.setAuthor("Mary taka");

        bookDTOList.add(bookDTO);
    }

    @GetMapping
    public List<BookDTO> listBooks() {
        return bookDTOList;
    }

    @GetMapping("{isbn}")
    public BookDTO getBookById(@PathVariable(name = "isbn") String isbn) {
        return searchBookByISBN(isbn);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BookDTO creatBook(@RequestBody BookDTO newBook) {
        bookDTOList.add(newBook);
        return newBook;
    }

    @PutMapping("{isbn}")
    public BookDTO updatebook(@RequestBody NewBookDTO newBookDTO, @PathVariable String isbn) {
        BookDTO bookFound = searchBookByISBN(isbn);

        bookFound.setTitle(newBookDTO.getTitle());
        bookFound.setAuthor(newBookDTO.getAuthor());
        bookFound.setPrice(newBookDTO.getPrice());

        return bookFound;
    }

    @PatchMapping("{isbn}")
    public BookDTO updateBookPrice(@RequestBody NewPriceDTO newPriceDTO, @PathVariable String isbn) {
        BookDTO bookFound = searchBookByISBN(isbn);

        bookFound.setPrice(newPriceDTO.getPrice());

        return bookFound;
    }

    @DeleteMapping("{isbn}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBook(@PathVariable String isbn) {
        BookDTO bookFound = searchBookByISBN(isbn);
        bookDTOList.remove(bookFound);
    }

    private BookDTO searchBookByISBN(@PathVariable String isbn) {
        return bookDTOList.stream().filter(dto -> dto.getIsbn().equals(isbn)).findFirst().orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
}
