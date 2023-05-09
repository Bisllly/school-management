package no.restaff.schoolmanagement.entity;

import no.restaff.schoolmanagement.entity.Student;

import javax.persistence.*;

@Entity
@Table(name = "classes_teachers")
public class Class_Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "class_id")
    private Classes classes;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    public Class_Teacher() {
    }

    public Class_Teacher(Classes classes, Teacher teacher) {
        this.classes = classes;
        this.teacher = teacher;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
