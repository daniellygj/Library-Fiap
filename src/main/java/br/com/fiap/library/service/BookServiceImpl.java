package br.com.fiap.library.service;

import br.com.fiap.library.dto.BookDTO;
import br.com.fiap.library.dto.NewBookDTO;
import br.com.fiap.library.dto.NewPriceDTO;
import br.com.fiap.library.entity.Book;
import br.com.fiap.library.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<BookDTO> listBooks(String title) {
        List<Book> bookList;
        if (title == null) {
            bookList = bookRepository.findAll();
        } else {
            bookList = bookRepository.findAllByTitleLike(title);
        }
        return bookList
                .stream()
                .map(p -> new BookDTO())
                .collect(Collectors.toList());
    }

    @Override
    public BookDTO findBookById(Long id) {
        Book book = bookRepository.getById(id);
        return new BookDTO(book);
    }

    @Override
    public BookDTO create(NewBookDTO newBookDTO) {
        Book book = new Book(newBookDTO);
        Book bookSaved = bookRepository.save(book);

        return new BookDTO(bookSaved);
    }

    @Override
    public BookDTO update(Long id, NewBookDTO newBookDTO) {
        Book book = bookRepository.getById(id);
        book.setTitle(newBookDTO.getTitle());
        book.setReleaseDate(newBookDTO.getReleaseDate());
        book.setIsbn(newBookDTO.getIsbn());
        book.setPageQty(newBookDTO.getPageQty());

        Book bookSaved = bookRepository.save(book);
        return new BookDTO(bookSaved);
    }

    @Override
    public BookDTO updatePrice(Long id, NewPriceDTO newPriceDTO) {
        Book book = bookRepository.getById(id);
        book.setPrice(newPriceDTO.getPrice());

        Book bookSaved = bookRepository.save(book);
        return new BookDTO(bookSaved);
    }

    @Override
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);

    }
}
