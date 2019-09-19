package com.ics.demo;

import com.ics.demo.models.Course;
import com.ics.demo.models.Student;
import com.ics.demo.models.University;
import com.ics.demo.repositories.CourseRepository;
import com.ics.demo.repositories.StudentRepository;
import com.ics.demo.repositories.UniversityRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DummyData implements CommandLineRunner {

    private final UniversityRepository universityRepository;
    public DummyData(UniversityRepository universityRepository, CourseRepository courseRepository, StudentRepository studentRepository){
        this.universityRepository = universityRepository;
        this.courseRepository = courseRepository;
        this.studentRepository = studentRepository;
    }

    private final CourseRepository courseRepository;
    private final StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
        University strath = new University("strathmore", "ole sangale");
        universityRepository.save(strath);

        University jkuat = new University("JKUAT", "Juja");
        universityRepository.save(jkuat);
        University uon = new University("UON", "university way");
        universityRepository.save(uon);

        Course course = courseRepository.save(new Course("Application programming for the internet"));

        Course course1 = new Course("Distributed object");
        courseRepository.save(course1);

        Student student= studentRepository.save(new Student("zipporah", "Naliaka", jkuat));

course.addStudent(student);
courseRepository.save(course);

    }

//    private final StudentRepository studentRepository;
//    public DummyData(StudentRepository studentRepository){
//        this.studentRepository = studentRepository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        Student ics = new Student("Lucas","Oppal", "JKUAT");
//        ics.setMiddle_name("Nyamoto");
//        ics.setDob("2013");
//        studentRepository.save(ics);
//        Student bcomm = new Student("Ouma","Okello");
//        studentRepository.save(bcomm);
//        Student law = new Student("James","Millan");
//        studentRepository.save(law);
//    }

}
