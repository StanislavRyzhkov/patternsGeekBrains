package company.ryzhkov.decorator.repository;

import company.ryzhkov.decorator.entity.Author;
import company.ryzhkov.decorator.entity.Book;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class BookInMemoryRepository implements BookRepository {
    private Map<Long, Book> books = new ConcurrentHashMap<>();

    public BookInMemoryRepository() {
        Book book = new Book();

        Author author = new Author();
        author.setId(1L);
        author.setFirstName("Leo");
        author.setSecondName("Tolstoy");
        Set<Author> authors = new HashSet<>(Collections.singletonList(author));

        book.setId(1L);
        book.setTitle("War and peace");
        book.setAuthors(authors);
        book.setPrice(1000);
        book.setVendorCode("rcl12445");

        books.put(book.getId(), book);
    }

    @Override
    public Optional<Book> findById(Long id) {
        Book book = books.get(id);
        if (book == null) {
            return Optional.empty();
        }
        return Optional.of(book);
    }
}
