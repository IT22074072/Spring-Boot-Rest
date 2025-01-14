package org.example.springbootrest;

import org.example.springbootrest.model.JobPost;
import org.example.springbootrest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class JobRestController {

    @Autowired
    private JobService service;

    @GetMapping("jobPosts")
    //@ResponseBody  //returning daya as json data(instead use restController)_
    public List<JobPost> getAllJobs(){
        return service.getAllJobs();
    }

    @GetMapping("jobPost/{postId}")
    public JobPost getJob(@PathVariable("postId") int postId){
        return service.getJob(postId);
    }

    @PostMapping("jobPost")
    public JobPost addJob(@RequestBody JobPost jobPost){
        service.addJobPost(jobPost);
        return service.getJob(jobPost.getPostId());

    }

    @PutMapping("jobPost")
    public JobPost updateJob(@RequestBody JobPost jobPost){
       service.updateJob(jobPost);
       return service.getJob(jobPost.getPostId());
    }

    @DeleteMapping("jobPost/{postId}")
    public String deleteJob(@PathVariable("postId") int postId){
        service.deleteJob(postId);
        return "Job deleted";

    }

    @GetMapping("load")
    public String loadData() {
        service.load();
        return "success";
    }

}
