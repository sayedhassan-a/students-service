package com.example.student.controller;

import com.example.student.dto.StudentDTO;
import com.example.student.repository.StudentRepository;
import com.example.student.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("sayed")
public class CourseController {
    private final StudentService studentService;
    private final StudentRepository studentRepository;
    public CourseController(StudentService studentService, StudentRepository studentRepository) {
        this.studentService = studentService;
        this.studentRepository = studentRepository;
    }

    @GetMapping("/{id}/students")
    public List<StudentDTO> getStudents(@PathVariable Integer id) {
        return studentService.getStudentsByCourseId(id);
    }


}
