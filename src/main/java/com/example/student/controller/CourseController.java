package com.example.student.controller;

import com.example.student.dto.StudentDTO;
import com.example.student.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("courses")
public class CourseController {
    private final StudentService studentService;
    public CourseController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/{id}/students")
    public List<StudentDTO> getStudents(Integer courseId) {
        return studentService.getStudentsByCourseId(courseId);
    }


}
