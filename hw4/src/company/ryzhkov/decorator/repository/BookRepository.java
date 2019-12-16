package company.ryzhkov.decorator.repository;

import company.ryzhkov.decorator.entity.Book;

import java.util.Optional;

public interface BookRepository {
    Optional<Book> findById(Long id);
}
