package com.example.student.service;

import com.example.student.dto.StudentDTO;
import com.example.student.entity.Student;
import com.example.student.repository.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Integer getCourseByStudentId(Integer studentId) {
        return studentRepository.findById(studentId).orElseThrow(RuntimeException::new).getCourseId();
    }

    public List<StudentDTO> getStudentsByCourseId(Integer courseId) {
        return studentRepository.findByCourseId(courseId).stream().map(StudentDTO::new).toList();
    }

    @Transactional
    public void setCourse(Integer studentId, Integer courseId) {
        Student student = studentRepository.findById(studentId).orElseThrow(RuntimeException::new);
        student.setCourseId(courseId);
    }

}
