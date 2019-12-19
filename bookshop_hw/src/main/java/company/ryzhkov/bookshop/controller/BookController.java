package company.ryzhkov.bookshop.controller;

import company.ryzhkov.bookshop.dto.BookInfoDTO;
import company.ryzhkov.bookshop.entity.Book;
import company.ryzhkov.bookshop.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("books")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @GetMapping
    public List<BookInfoDTO> finaAll() {
        return bookService.findAll();
    }

    @GetMapping("/{id}")
    public Book add(@PathVariable("id") Long id) {
        return bookService.findById(id);
    }
}
