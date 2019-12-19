package company.ryzhkov.bookshop.service;

import company.ryzhkov.bookshop.dto.BookInfoDTO;
import company.ryzhkov.bookshop.entity.AbstractEntity;
import company.ryzhkov.bookshop.entity.Book;
import company.ryzhkov.bookshop.exception.NotFoundException;
import company.ryzhkov.bookshop.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;
    private Map<Long, Book> syncMap;

    @PostConstruct
    public void init() {
        Map<Long, Book> books = ((List<Book>)bookRepository.findAll())
                .stream()
                .collect(Collectors.toMap(
                        AbstractEntity::getId,
                        Function.identity())
                );
        syncMap = Collections.synchronizedMap(books);
    }

    public List<BookInfoDTO> findAll() {
        return ((List<Book>) bookRepository.findAll())
                .stream()
                .map(BookInfoDTO::createInstance)
                .collect(Collectors.toList());
    }

    public Book findById(Long id) {
        Book book = syncMap.get(id);
        if (book == null) return bookRepository.findById(id).orElseThrow(NotFoundException::new);
        return book;
    }
}
