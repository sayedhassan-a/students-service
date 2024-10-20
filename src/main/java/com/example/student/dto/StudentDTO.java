package com.example.student.dto;

import com.example.student.entity.Student;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class StudentDTO {
    private Integer id;
    private String name;
    private String surname;

    public StudentDTO(Student student) {
        this.id = student.getId();
        this.name = student.getName();
        this.surname = student.getSurname();
    }
}

