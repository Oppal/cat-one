package com.ics.demo.services;

import com.ics.demo.models.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    Student findById(Long id);

    void delete(Long id);
    Student createStudent(Student student);

    Student updateStudent(Student student);

    Student updateStudent(Long id, Student student);

    Student update(Student student);
    Student update(Long id, Student student);

}
