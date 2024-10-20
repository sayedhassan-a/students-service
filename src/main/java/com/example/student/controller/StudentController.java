package com.example.student.controller;

import com.example.student.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("students")
public class StudentController {
    private final StudentService studentService;
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/{id}/courses")
    public Integer getCourse(Integer studentId) {
        return studentService.getCourseByStudentId(studentId);
    }

}
