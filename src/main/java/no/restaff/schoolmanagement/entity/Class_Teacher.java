package no.restaff.schoolmanagement.entity;

import no.restaff.schoolmanagement.serializable.ClassTeacherId;

import javax.persistence.*;

@Entity
@Table(name = "classes_teachers")
public class Class_Teacher {
    @EmbeddedId
    private ClassTeacherId id;

    @ManyToOne
    @MapsId("classId")
    @JoinColumn(name = "class_id")
    private Classes classes;

    @ManyToOne
    @MapsId("teacherId")
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    public Class_Teacher() {
    }

    public Class_Teacher(Classes classes, Teacher teacher) {
        this.classes = classes;
        this.teacher = teacher;
    }

    public ClassTeacherId getId() {
        return id;
    }

    public void setId(ClassTeacherId id) {
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
