package no.restaff.schoolmanagement.controller;

import no.restaff.schoolmanagement.entity.Classes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MajorController {
    private no.restaff.schoolmanagement.service.MajorService MajorService;

    @Autowired
    MajorController(no.restaff.schoolmanagement.service.MajorService MajorService) {
        super();
        this.MajorService = MajorService;
    }

    @GetMapping("/classes")
    public String listStudents(Model model) {
        model.addAttribute("classes", MajorService.getAllMajor());
        return "classes_student";
    }

    @GetMapping("/classes/new")
    public String createMajorForm(Model model) {
        //create student object to hold student form data
        Classes classes = new Classes();
        model.addAttribute("classes", classes);
        return "create_classes";
    }
    @PostMapping("/classes")
    public String saveMajor(@ModelAttribute("classes") Classes classes) {
        MajorService.saveMajor(classes);
        return "redirect:/classes";
    }

}
