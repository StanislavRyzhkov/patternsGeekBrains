package company.ryzhkov.bookshop.dto;

import company.ryzhkov.bookshop.entity.Author;
import company.ryzhkov.bookshop.entity.Book;
import lombok.Getter;

import java.util.stream.Collectors;

/*
* При выводе списка книг на веб-странице
* достаточно скоращенной информации о продукте
* Реализация паттерна "Преобразователь данных"
* */

@Getter
public class BookInfoDTO {
    private final String title;
    private final int price;
    private final String description;
    private final String authorShortNames;

    private BookInfoDTO(String title, int price, String description, String authorShortNames) {
        this.title = title;
        this.price = price;
        this.description = description;
        this.authorShortNames = authorShortNames;
    }

    private static String authorToShortName(Author author) {
        String firstLetterOfName = author.getFirstName().substring(0, 1) + ".";

        return firstLetterOfName + " " + author.getSecondName();
    }

    public static BookInfoDTO createInstance(Book book) {
        String description = book.getStyle().getName() + "; " + book.getOrigin().getName();

        String authorShortNames = book.getAuthors()
                .stream()
                .map(BookInfoDTO::authorToShortName)
                .collect(Collectors.joining("; "));

        return new BookInfoDTO(
                book.getTitle(),
                book.getPrice(),
                description,
                authorShortNames
        );
    }
}
