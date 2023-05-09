package no.restaff.schoolmanagement.repository;

import no.restaff.schoolmanagement.entity.Classes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRepository extends JpaRepository<Classes, Long> {

}
