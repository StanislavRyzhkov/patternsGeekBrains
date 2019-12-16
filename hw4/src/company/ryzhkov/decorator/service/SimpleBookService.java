package company.ryzhkov.decorator.service;

import company.ryzhkov.decorator.entity.Book;
import company.ryzhkov.decorator.exception.NotFoundException;
import company.ryzhkov.decorator.repository.BookRepository;

public class SimpleBookService implements BookService {
    private BookRepository bookRepository;

    public SimpleBookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book getBookById(Long id) {
        return bookRepository
                .findById(id)
                .orElseThrow(NotFoundException::new);
    }
}
