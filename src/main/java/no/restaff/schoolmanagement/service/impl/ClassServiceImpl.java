package no.restaff.schoolmanagement.service.impl;

import no.restaff.schoolmanagement.entity.Classes;
import no.restaff.schoolmanagement.repository.ClassRepository;
import no.restaff.schoolmanagement.service.ClassService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassServiceImpl implements ClassService {

    private ClassRepository studentRepository;

    public ClassServiceImpl(ClassRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Classes> getAllClass() {
        return studentRepository.findAll();
    }

    @Override
    public Classes saveClass(Classes student) {
        return studentRepository.save(student);
    }

    @Override
    public Classes getClassById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Classes updateClass(Classes student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteClassById(Long id) {
        studentRepository.deleteById(id);
    }
}
