package company.ryzhkov.decorator.entity;

import java.util.Set;

public class Book implements Comparable<Book> {
    private Long id;
    private String title;
    private Integer price;
    private String vendorCode;
    private Set<Author> authors;

    public Book() {
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getPrice() {
        return price;
    }

    public String getVendorCode() {
        return vendorCode;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    @Override
    public int compareTo(Book o) {
        return this.title.compareTo(o.title);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (Author author : authors) {
            builder.append(author.toString());
            builder.append(", ");
        }
        builder.deleteCharAt(builder.length() - 1);
        builder.deleteCharAt(builder.length() - 1);
        builder.append("]");
        String authorsSet = builder.toString();
        return String.format("Book(id: %d, title: %s, authors: %s)", id, title, authorsSet);
    }
}
