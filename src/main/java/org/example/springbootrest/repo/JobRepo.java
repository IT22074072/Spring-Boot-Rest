package org.example.springbootrest.repo;

import org.example.springbootrest.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {

}
