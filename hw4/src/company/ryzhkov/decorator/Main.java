package company.ryzhkov.decorator;

import company.ryzhkov.decorator.entity.Book;
import company.ryzhkov.decorator.repository.BookInMemoryRepository;
import company.ryzhkov.decorator.repository.BookRepository;
import company.ryzhkov.decorator.service.BookService;
import company.ryzhkov.decorator.service.LoggingBookService;
import company.ryzhkov.decorator.service.SimpleBookService;

public class Main {

    public static void main(String[] args) {
        BookRepository bookRepository = new BookInMemoryRepository();
        BookService bookService = new LoggingBookService(new SimpleBookService(bookRepository));
        try {
            Book book = bookService.getBookById(1L);
            System.out.println(book);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
