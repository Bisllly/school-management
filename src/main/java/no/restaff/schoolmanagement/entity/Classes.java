package no.restaff.schoolmanagement.entity;

import javax.persistence.*;

@Entity
@Table( name = "classes")
public class Classes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column( name = "name_class", nullable = false)
    private String nameClass;

    public Classes() {
    }

    public Classes(String nameClass) {
        this.nameClass = nameClass;
    }
}
