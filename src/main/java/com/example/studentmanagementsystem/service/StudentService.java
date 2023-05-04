//this is according to video tutorial

//package com.example.studentmanagementsystem.service;
//
//import com.example.studentmanagementsystem.entity.Student;
//
//import java.util.List;
//
//public interface StudentService {
//    List<Student> getAllStudents();
//}


//this is my debug process
package com.example.studentmanagementsystem.service;


import com.example.studentmanagementsystem.entity.Student;
import com.example.studentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public  StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
