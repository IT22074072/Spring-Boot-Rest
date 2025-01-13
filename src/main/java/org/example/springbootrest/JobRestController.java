package org.example.springbootrest;

import org.example.springbootrest.model.JobPost;
import org.example.springbootrest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JobRestController {

    @Autowired
    private JobService service;

    @GetMapping("jobPosts")
    //@ResponseBody  //returning daya as json data(instead use restController)_
    public List<JobPost> getAllJobs(){
        return service.getAllJobs();
    }


}
