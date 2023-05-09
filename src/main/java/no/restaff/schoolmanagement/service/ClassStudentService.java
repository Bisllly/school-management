package no.restaff.schoolmanagement.service;

import no.restaff.schoolmanagement.entity.Classes;
import no.restaff.schoolmanagement.entity.Student;

import java.util.List;

public interface ClassStudentService {
    List<Classes> getAllClassStudent();
}
