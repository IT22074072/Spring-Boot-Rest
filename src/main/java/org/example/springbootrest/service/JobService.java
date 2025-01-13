package org.example.springbootrest.service;

import org.example.springbootrest.model.JobPost;
import org.example.springbootrest.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    JobRepo repo;

    //method to return all JobPosts
    public List<JobPost> getAllJobs(){
        return repo.getAllJobs();
    }

    //method to add a jobPost
    public void addJobPost(JobPost job){
        repo.addJobPost(job);
    }

}
