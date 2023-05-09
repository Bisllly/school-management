package no.restaff.schoolmanagement.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table( name = "classes")
public class Classes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column( name = "name_class", nullable = false)
    private String nameClass;
    @OneToMany(mappedBy = "classes")
    private List<Student> studens;
    @ManyToMany(mappedBy = "classes")
    private Set<Teacher> teacher = new HashSet<>();

    public Classes() {
    }

    public Classes(List<Student> studens, String nameClass, Set<Teacher> teacher) {
        this.studens = studens;
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

    public List<Student> getStudens() {
        return studens;
    }

    public void setStudens(List<Student> studens) {
        this.studens = studens;
    }

}
