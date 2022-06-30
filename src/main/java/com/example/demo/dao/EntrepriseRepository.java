package com.example.demo.dao;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.entities.Entreprise;

import java.util.List;

@RepositoryRestResource
public interface EntrepriseRepository extends MongoRepository<Entreprise, String> {
	
    public Entreprise findByEntreprisename(String entreprisename);
 //   public Entreprise readByUserId(String userId);
   /**/

}
