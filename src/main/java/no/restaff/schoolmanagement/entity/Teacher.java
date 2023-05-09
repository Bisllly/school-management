package no.restaff.schoolmanagement.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table( name = "teachers" )
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column( name = "first_name", nullable = false)
    private String firstName;

    @Column( name = "last_name")
    private String lastName;

    @Column( name = "email")
    private String email;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "classes_teachers",
            joinColumns = @JoinColumn(name = "teacher_id"),
            inverseJoinColumns = @JoinColumn(name = "class_id"))
    private Set<Classes> classes = new HashSet<>();

    public Teacher() {
    }

    public Teacher(String firstName, String lastName, String email, Set<Classes> classes) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.classes = classes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Classes> getClasses() {
        return classes;
    }

    public void setClasses(Set<Classes> classes) {
        this.classes = classes;
    }

}
