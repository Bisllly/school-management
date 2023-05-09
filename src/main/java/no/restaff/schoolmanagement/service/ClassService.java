package no.restaff.schoolmanagement.service;

import no.restaff.schoolmanagement.entity.Classes;

import java.util.List;

public interface ClassService {
    List<Classes> getAllClass();

    Classes saveClass(Classes teacher);
    Classes getClassById(Long id);

    Classes updateClass(Classes teacher);

    void deleteClassById(Long id);
}
