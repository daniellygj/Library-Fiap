package br.com.fiap.library.repository;

import br.com.fiap.library.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findAllByTitleLike(String title);

    @Query("select l from Book l where l.title like :title")
    List<Book> listBookByTitle(String title);

}
