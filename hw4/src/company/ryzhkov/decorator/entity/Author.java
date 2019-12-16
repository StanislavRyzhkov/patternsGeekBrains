package company.ryzhkov.decorator.entity;

import java.util.Set;

public class Author implements Comparable<Author> {
    private Long id;
    private String firstName;
    private String secondName;
    private Set<Book> bookSet;

    public Author() {
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public Set<Book> getBookSet() {
        return bookSet;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setBookSet(Set<Book> bookSet) {
        this.bookSet = bookSet;
    }

    @Override
    public int compareTo(Author o) {
        return String
                .format("%s %s", this.secondName, this.firstName)
                .compareTo(String.format("%s %s", o.secondName, o.firstName));
    }

    @Override
    public String toString() {
        return secondName;
    }
}
