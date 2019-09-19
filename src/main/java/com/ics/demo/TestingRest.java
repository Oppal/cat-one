package com.ics.demo;

import com.ics.demo.models.MockAppointment;
import com.ics.demo.models.MockLecturer;
import com.ics.demo.models.MockStudent;
import com.ics.demo.models.University;
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

    private final FeignRestClient feignRestClient;
    private final MockFeignClient mockFeignClient;

    public TestingRest(FeignRestClient feignRestClient, MockFeignClient mockFeignClient) {
        this.feignRestClient = feignRestClient;
        this.mockFeignClient = mockFeignClient;
    }

    @Override
    public void run(String... args) throws Exception {
        RestTemplate restTemplate= new RestTemplate();

        ResponseEntity<List<University>> response = restTemplate.exchange(
                "http://10.51.10.111:9090/universities",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<University>>(){});
        List<University> universities = response.getBody();
        System.out.println("Response:"+universities.toString() );

//        universities = feignRestClient.getAllUniversities();
//        System.out.println("Feign Universities:"+universities.toString());

        University university = restTemplate.getForObject(
                "http://10.51.10.111:9090/universities/1",
                University.class
        );

String url = "http://10.51.10.111:9090/universities/search?name="+university.getName();
        University searched = restTemplate.getForObject(
                url,
                University.class
        );


        MockStudent student = mockFeignClient.createStudent(new MockStudent("94459", "Lucas Oppal"));
        System.out.println(student);

        MockStudent searchByName = mockFeignClient.searchByName(student.getStudentNumber());
        System.out.println("Search returns"+searchByName);

        List<MockLecturer> lecturers = mockFeignClient.viewLecturers();
        System.out.println("Lecturers:"+lecturers);

        MockAppointment mockAppointment = mockFeignClient.createAppointment(new MockAppointment(student.getId(), lecturers.get(0).getId()));
        System.out.println("Created Appointment: "+ mockAppointment);

        MockAppointment confirmappointment = mockFeignClient.confirmAppointment(mockAppointment.getId(), student.getId());
        System.out.println("Appointment confirmed:"+confirmappointment);

}
}
