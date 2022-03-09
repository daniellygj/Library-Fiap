package br.com.fiap.library.service;

import br.com.fiap.library.dto.BookDTO;
import br.com.fiap.library.dto.NewBookDTO;
import br.com.fiap.library.dto.NewPriceDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BookService {

    List<BookDTO> listBooks(String title);

    BookDTO findBookById(Long id);

    BookDTO create(NewBookDTO newBookDTO);

    BookDTO update(Long id, NewBookDTO newBookDTO);

    BookDTO updatePrice(Long id, NewPriceDTO newPriceDTO);

    void deleteBook(Long id);

}
