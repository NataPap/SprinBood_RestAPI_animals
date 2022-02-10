package program.entities;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@Table(name="tbl_animals")
@ToString
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 200, nullable = false)
    private String class_animal;
    @Column(length = 200, nullable = false)
    private String name;
    @Column(nullable = false)
    private String description;

}
