package no.restaff.schoolmanagement.entity;

import javax.persistence.*;

@Entity
@Table(name = "classes_teachers")
public class Class_Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Teacher teacher;
}
