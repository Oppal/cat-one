package com.ics.demo;

import com.ics.demo.models.University;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name="client",url="http://10.51.10.111:9090")
public interface FeignRestClient {

    @RequestMapping(method= RequestMethod.GET, value="universities")
List<University> getAllUniversities();

@RequestMapping(method=RequestMethod.GET, value = "universities/{id}")
    University findUniversityById(@PathVariable(name="id")Long id);

    @RequestMapping(method=RequestMethod.POST, value = "university")
    University createUniversity(@RequestBody University university);


}

