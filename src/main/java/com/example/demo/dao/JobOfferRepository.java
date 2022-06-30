package com.example.demo.dao;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.entities.JobOffer;

@RepositoryRestResource
public interface JobOfferRepository extends MongoRepository<JobOffer,String> {
    public JobOffer findByOffreId(String offreId);
    public List<JobOffer> findByName(String name);
    public List<JobOffer> findByEntreprisename(String entreprisename);

}
