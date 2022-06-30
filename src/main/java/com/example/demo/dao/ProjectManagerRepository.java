package com.example.demo.dao;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.entities.ProjectManager;

import java.util.List;

@RepositoryRestResource
public interface ProjectManagerRepository extends MongoRepository<ProjectManager, String> {
    public ProjectManager findByProjectManagerId(String projectManagerId);

}
