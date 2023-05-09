package no.restaff.schoolmanagement.service.impl;

import no.restaff.schoolmanagement.entity.Classes;
import no.restaff.schoolmanagement.entity.Student;
import no.restaff.schoolmanagement.repository.ClassStudentRepository;
import no.restaff.schoolmanagement.repository.StudentRepository;
import no.restaff.schoolmanagement.service.ClassStudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassStudentServiceImpl implements ClassStudentService {
    private ClassStudentRepository classStudentRepository;
    public ClassStudentServiceImpl(ClassStudentRepository classStudentRepository) {
        super();
        this.classStudentRepository = classStudentRepository;
    }
    @Override
    public List<Classes> getAllClassStudent() {
        return classStudentRepository.findAll();
    }
}
