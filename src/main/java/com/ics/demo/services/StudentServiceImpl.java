package com.ics.demo.services;

import com.ics.demo.NotFoundException;
import com.ics.demo.models.Student;
import com.ics.demo.repositories.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(Long id) {

        return studentRepository.findById(id).orElseThrow(()-> new NotFoundException("No university with id" +id+"found"));



    }

    @Override
    public void delete(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        Student found = findById(student.getId());


        found.setFirst_name(student.getFirst_name());
        found.setLast_name(student.getLast_name());
        found.setMiddle_name(student.getMiddle_name());
        found.setDob(student.getDob());

        return studentRepository.save(found);
    }

    @Override
    public Student updateStudent(Long id, Student student) {
        return null;
    }

    @Override
    public Student update(Student student) {
        return null;
    }

    @Override
    public Student update(Long id, Student student) {
        return null;
    }


}
