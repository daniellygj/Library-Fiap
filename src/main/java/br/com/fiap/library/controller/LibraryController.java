package br.com.fiap.library.controller;

import br.com.fiap.library.dto.BookDTO;
import br.com.fiap.library.dto.NewBookDTO;
import br.com.fiap.library.dto.NewPriceDTO;
import br.com.fiap.library.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("books")
public class LibraryController {

    private final BookService bookService;

    public LibraryController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<BookDTO> listBooks(@RequestParam(required = false, value = "title") String title) {
        return bookService.listBooks(title);
    }

    @GetMapping("{id}")
    public BookDTO getBookById(@PathVariable(name = "isbn") Long id) {
        return bookService.findBookById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BookDTO createBook(@RequestBody NewBookDTO newBook) {
        return bookService.create(newBook);
    }

    @PutMapping("{id}")
    public BookDTO updatebook(@RequestBody NewBookDTO newBookDTO, @PathVariable Long id) {
        return bookService.update(id, newBookDTO);
    }

    @PatchMapping("{id}")
    public BookDTO updateBookPrice(@RequestBody NewPriceDTO newPriceDTO, @PathVariable Long id) {
        return bookService.updatePrice(id, newPriceDTO);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
    }
}
