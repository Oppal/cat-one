package com.ics.demo;

import com.ics.demo.models.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import javax.persistence.Column;
import java.lang.reflect.ParameterizedType;
import java.util.List;
@Component
public class TestingRest implements CommandLineRunner {

       // private final FeignRestClient feignRestClient; // creates a variable of class FeignRestClient
    private final MockFeignClient mockFeignClient; // creates a variable of class MockFeignClient

    public TestingRest(MockFeignClient mockFeignClient) {
        this.mockFeignClient = mockFeignClient;
    }

    @Override
    public void run(String... args) throws Exception {
//        RestTemplate restTemplate= new RestTemplate();
//
//        ResponseEntity<List<University>> response = restTemplate.exchange(
//                "http://10.50.35.23:1000/universities",
//                HttpMethod.GET,
//                null,
//                new ParameterizedTypeReference<List<University>>(){});
//
//        List<University> universities = response.getBody();
//        System.out.println("Response:"+universities.toString() );
//
////        universities = feignRestClient.getAllUniversities();
////        System.out.println("Feign Universities:"+universities.toString());
//
//        University university = restTemplate.getForObject(
//                "http://10.50.35.23:1000/universities/1",
//                University.class
//        );
//
//String url = "http://10.50.35.23:1000/universities/search?name="+university.getName();
//        University searched = restTemplate.getForObject(
//                url,
//                University.class
//        );





//
//        List<MockLecturer> lecturers = mockFeignClient.viewLecturers();
//        System.out.println("Lecturers:"+lecturers);
//        List<MockStudent> students = mockFeignClient.getAllStudents();

   //MockStudent student = mockFeignClient.createStudent(new MockStudent("94459", "Lucas Oppal"));
        mockFeignClient.createMatch("MALE", (long) 45);


//        MockStudent enroll = mockFeignClient.enroll((long)1, (long)8);
//        MockStudent validate = mockFeignClient.validate((long)1, "rytyfhdvgtr7637");


//
//        MockStudent searchByName = mockFeignClient.searchByName(student.getStudentNumber());
//        System.out.println("Search returns"+searchByName);
//
//        MockAppointment mockAppointment = mockFeignClient.createAppointment(new MockAppointment(student.getId(), 1L));
//        System.out.println("Created Appointment: "+ mockAppointment);
//
//        MockAppointment confirmAppointment = mockFeignClient.confirmAppointment(mockAppointment.getId(), student.getId());
//        System.out.println("Appointment confirmed:"+confirmAppointment);


//        Student student =new Student(911111,"okwemba");
//        feignRestClient.createStudent(student);
//        feignRestClient.RequestAttachment((long)6,(long)24);
//        feignRestClient.RequestDepartment((long)6,(long)24,(long)12);
      //  mockFeignClient.RejectMatch(new Match((long)21, "i dont want");


    }
}
