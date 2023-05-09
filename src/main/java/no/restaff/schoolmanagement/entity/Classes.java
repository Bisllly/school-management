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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }
}
