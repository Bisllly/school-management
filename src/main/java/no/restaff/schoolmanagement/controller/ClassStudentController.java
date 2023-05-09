package no.restaff.schoolmanagement.controller;

import no.restaff.schoolmanagement.entity.Classes;
import no.restaff.schoolmanagement.entity.Student;
import no.restaff.schoolmanagement.service.ClassStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.ClassesKey;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClassStudentController {
    private ClassStudentService classStudentService;

    @Autowired
    ClassStudentController(ClassStudentService classStudentService) {
        super();
        this.classStudentService = classStudentService;
    }

    @GetMapping("/classes")
    public String listStudents(Model model) {
        model.addAttribute("classes", classStudentService.getAllClassStudent());
        return "classes_student";
    }

    @GetMapping("/classes/new")
    public String createClassStudentForm(Model model) {
        //create student object to hold student form data
        Classes classes = new Classes();
        model.addAttribute("classes", classes);
        return "create_classes";
    }
    @PostMapping("/classes")
    public String saveClassStudent(@ModelAttribute("classes") Classes classes) {
        classStudentService.saveClassStudent(classes);
        return "redirect:/classes";
    }

}
