package de.example.resttest.controller;

import de.example.resttest.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")
public class StudentController {

    @GetMapping
    public Student getStudent(){
        return new Student("Heinz", 28, "Java");
    }
}
