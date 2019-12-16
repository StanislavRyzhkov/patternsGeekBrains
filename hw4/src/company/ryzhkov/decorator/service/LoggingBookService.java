package company.ryzhkov.decorator.service;

/*
* Декоратор, добавляющий в базовый сервис новое поведение - логгирование
**/

import company.ryzhkov.decorator.entity.Book;

import java.util.logging.Logger;

public class LoggingBookService implements BookService {
    private final static Logger log = Logger.getLogger(LoggingBookService.class.getName());
    private final BookService bookService;

    public LoggingBookService(BookService bookService) {
        this.bookService = bookService;
    }

    @Override
    public Book getBookById(Long id) {
        log.info("Method getBookById was called");
        return bookService.getBookById(id);
    }
}
