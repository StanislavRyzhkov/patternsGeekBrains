package company.ryzhkov.bookshop.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "origins")
public class Origin extends AbstractEntity {

    @Column(name = "name")
    private String name;

    @JsonBackReference
    @OneToMany(mappedBy = "origin", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<Book> books;
}
