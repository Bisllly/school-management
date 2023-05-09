package no.restaff.schoolmanagement.controller;

import no.restaff.schoolmanagement.service.ClassStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
        return "classes";
    }
}
