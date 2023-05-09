package no.restaff.schoolmanagement.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table( name = "classes")
public class Classes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column( name = "name_class", nullable = false)
    private String nameClass;

    @ManyToMany(mappedBy = "teachers")
    private Set<Teacher> teacher = new HashSet<>();

    public Classes() {
    }

    public Classes(String nameClass, Set<Teacher> teacher) {
        this.nameClass = nameClass;
        this.teacher = teacher;
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

    public Set<Teacher> getTeacher() {
        return teacher;
    }

    public void setTeacher(Set<Teacher> teacher) {
        this.teacher = teacher;
    }
}
