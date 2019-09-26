package com.ics.demo;

import com.ics.demo.models.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name="mockclient", url = "http://10.51.10.111:2200", configuration = FeignConfig.class)

public interface MockFeignClient {
    //creates a student object of type MockStudent
//    @RequestMapping(method=RequestMethod.POST, value="students")
//    MockStudent createStudent(@RequestBody MockStudent student);


    // retrieves student with parameter student number
//    @RequestMapping(method=RequestMethod.GET, value= "students")
//    MockStudent searchByName(@RequestParam(value="studentNumber") String number);



    //displays a list of lecturers
//    @RequestMapping(method = RequestMethod.GET, value="lecturers")
//    List<MockLecturer> viewLecturers();

    //create appointment object of type MockAppointment
//    @RequestMapping(method = RequestMethod.POST, value = "appointments")
//    MockAppointment createAppointment(@RequestBody MockAppointment appointment);

//    @RequestMapping(method=RequestMethod.GET, value = "students")
//    List<MockStudent> getAllStudents();

    @RequestMapping(method=RequestMethod.POST, value="students")
    MockStudent createStudent(@RequestBody MockStudent student);

    @RequestMapping(method = RequestMethod.POST, value = "matches")
    Match createMatch(@RequestBody Match match);

        @RequestMapping(method = RequestMethod.POST, value = "matches")
        Match createMatch(@RequestParam(name = "gender") String gender, @RequestParam(value="studentId") Long studentId);




//    @RequestMapping(method = RequestMethod.POST, value = "appointments")
//    MockAppointment createAppointment(@RequestBody MockAppointment appointment);


//    @RequestMapping(method = RequestMethod.PATCH, value = "appointments/{id}")
//    MockAppointment confirmAppointment(@PathVariable(name = "id") Long id, @RequestParam(value = "studentId")Long studentId);
//
//    @RequestMapping(method = RequestMethod.POST, value="{unitId}/enroll/{studentId}" )
//    MockStudent enroll(@PathVariable("unitId") Long unitId, @PathVariable("studentId") Long studentId);
//
//    @RequestMapping(method = RequestMethod.POST, value = "{unitId}/validate/{enrollmentKey}")
//    MockStudent validate(@PathVariable("unitId")Long unitId, @PathVariable("enrollmentKey") String enrollmentKey);

    //ch
//        @RequestMapping(method = RequestMethod.POST, value = "students")
//        Student createStudent(@RequestBody Student student);
//
//        @RequestMapping(method = RequestMethod.POST, value = "appointments")
//        Appointment createAppointment(@RequestBody Appointment appointment);
//
//        @RequestMapping(method = RequestMethod.PATCH, value = "appointments/{appointmentId}")
//        Appointment ConfirmAppointment(@PathVariable("appointmentId") Long id,@RequestParam(name = "studentId") Long studentId);
//
//        @RequestMapping(method = RequestMethod.POST, value = "companies/{companyId}/attachments")
//        Attachment RequestAttachment(@PathVariable("companyId") Long id, @RequestParam(name = "studentId") Long studentId);
//
//        @RequestMapping(method = RequestMethod.PATCH,value = "companies/{companyId}/attachments")
//        Department RequestDepartment(@PathVariable("companyId") Long companyId,@RequestParam(name = "studentId") Long studentId,@RequestParam(name = "departmentId") Long departmentId);
//
        @RequestMapping(method = RequestMethod.PATCH, value = "studentId")
        Match RejectMatch(@PathVariable("studentId") Long id, @RequestParam(name="reason") String reason);


}

