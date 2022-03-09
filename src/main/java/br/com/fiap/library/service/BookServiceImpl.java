package br.com.fiap.library.service;

import br.com.fiap.library.dto.BookDTO;
import br.com.fiap.library.dto.NewBookDTO;
import br.com.fiap.library.dto.NewPriceDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Override
    public List<BookDTO> listBooks(String title) {
        return null;
    }

    @Override
    public BookDTO findBookById(Long id) {
        return null;
    }

    @Override
    public BookDTO create(NewBookDTO newBookDTO) {
        return null;
    }

    @Override
    public BookDTO update(Long id, NewBookDTO newBookDTO) {
        return null;
    }

    @Override
    public BookDTO updatePrice(Long id, NewPriceDTO newPriceDTO) {
        return null;
    }

    @Override
    public void deleteBook(Long id) {

    }
}
