package no.restaff.schoolmanagement.controller;

import no.restaff.schoolmanagement.entity.Student;
import no.restaff.schoolmanagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StudentController {
    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //handler method to handle list students and return mode and view
    @GetMapping("/students")
    public String listStudents(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }

    @GetMapping("/students/new")
    public String createStudentForm(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        return "create_student";
    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student) {
        studentService.saveStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/students/edit/{id}")
    public String editStudentForm(@PathVariable Long id, Model model) {
        model.addAttribute("student", studentService.getStudentById(id));
        return "edit_student";
    }

    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable Long id,
            @ModelAttribute("student") Student student,
            Model model) {

        // get student from database by id
        Student existingStudent = studentService.getStudentById(id);
        existingStudent.setId(id);
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setEmail(student.getEmail());


        //save updated student object
        studentService.updateStudent((existingStudent));
        return "redirect:/students";
    }
    @GetMapping("/students/{id}")
    public String deleteStudents(@PathVariable Long id) {
        studentService.deleteStudentById(id);
        return "redirect:/students";
    }

    @GetMapping("/students/search")
    public String searchStudent(Model model) {
        //create student object to hold student form data
        Student student = new Student();
        model.addAttribute("student", student);
        return "search_student";
    }

    @PostMapping("/students/search")
    public String searchStudentByFirstName (@RequestParam("firstName") String firstName ,Model model) {
        List<Student> students = studentService.searchStudentByFirstName(firstName);
        model.addAttribute("students", students);
        return "search_student";
    }

}
