package company.ryzhkov;

import java.util.ArrayList;
import java.util.List;

public class PublishingHouse extends Publisher {

    private List<Book> books = new ArrayList<>();

    public PublishingHouse() {
        books.add(new Book("Чистый код", "Р. Мартин"));
    }

    public Book getLastBook() {
        return books.get(books.size() - 1);
    }

    @Override
    public String toString() {
        return "Publishing House";
    }
}
