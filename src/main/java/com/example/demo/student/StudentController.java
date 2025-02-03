package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// Endpoint: http://localhost:8080/api/v1/student/getStudents

/* Dependence Injection (DI): Design pattern in SW-Development that allows
objects (dependencies) to be asserted/injected into a class or module rather than
having it create the object itself.

Pros: more modular, testable, and loosely coupled code.

 */

// API Layer
@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping("/getStudents")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }
}
