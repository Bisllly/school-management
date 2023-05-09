package no.restaff.schoolmanagement.repository;

import no.restaff.schoolmanagement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
