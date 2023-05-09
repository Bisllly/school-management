package no.restaff.schoolmanagement.controller;

import no.restaff.schoolmanagement.entity.Classes;
import no.restaff.schoolmanagement.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClassController {
    private ClassService classService;

    @Autowired
    public ClassController(ClassService classService) {
        super();
        this.classService = classService;
    }

    //handler method to handle list classes and return mode and view
    @GetMapping("/classes")
    public String listClasss(Model model) {
        model.addAttribute("classes", classService.getAllClass());
        return "classes";
    }

    @GetMapping("/classes/new")
    public String createClassForm(Model model) {

        //create classes object to hold classes form data
        Classes classes = new Classes();
        model.addAttribute("class", classes);
        return "create_class";

    }

    @PostMapping("/classes")
    public String saveClass(@ModelAttribute("class") Classes classes) {
        classService.saveClass(classes);
        return "redirect:/classes";
    }

    @GetMapping("/classes/edit/{id}")
    public String editClassForm(@PathVariable Long id, Model model) {
        model.addAttribute("class", classService.getClassById(id));
        return "edit_student";
    }

    @PostMapping("/classes/{id}")
    public String updateClass(@PathVariable Long id,
            @ModelAttribute("class") Classes classes,
            Model model) {

        // get classes from database by id
        Classes existingClass = classService.getClassById(id);
        existingClass.setId(id);
        existingClass.setNameClass(classes.getNameClass());


        //save updated classes object
        classService.updateClass((existingClass));
        return "redirect:/classes";
    }
    @GetMapping("/classes/{id}")
    public String deleteClasss(@PathVariable Long id) {
        classService.deleteClassById(id);
        return "redirect:/classes";
    }

}
