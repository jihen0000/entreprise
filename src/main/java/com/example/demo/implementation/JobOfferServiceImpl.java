package com.example.demo.implementation;
import com.example.demo.entities.JobOffer;
import com.enit.demo.entities.Career;
import com.example.demo.dao.JobOfferRepository;
import com.example.demo.services.JobOfferService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JobOfferServiceImpl implements JobOfferService{
    @Autowired
    public JobOfferRepository jobOfferRepository;

    @Override
    @ResponseBody
    @PostMapping(path="/addOffer")
    public String addJob(@RequestBody JobOffer jobOffer){
        System.out.println("In addJob : ");
        jobOfferRepository.save(jobOffer);
        System.out.println("Out of addJob : ");
        return "200";
    }
    @Override
    @ResponseBody
    @DeleteMapping(path="/removeOffer/{offreId}")
    public List<JobOffer> removeJob(@PathVariable("offreId") String offreId){
        System.out.println("In removeJob : ");
        jobOfferRepository.deleteById(offreId);
        System.out.println("Out of removeJob : ");
        return jobOfferRepository.findAll();
    }
    
    
   
    
    
    
    @Override
    @ResponseBody
    @PutMapping("/updateOffer")
    public void updateJob(JobOffer jobOffer){
        jobOffer = jobOfferRepository.findByOffreId(jobOffer.getOffreId());
    }
    @Override
    @ResponseBody
    @GetMapping(path="/findOffer")
    public JobOffer findJobByOffreId(String offreId){
        return findJobByOffreId(offreId);
    }
    @Override
    @ResponseBody
    @GetMapping(path="/getallOffers")
    public List<JobOffer> getAllJobOffers(){
        return getAllJobOffers();
    }
    
    @ResponseBody
    @GetMapping(path="/GetOfferOf/{entreprisename}")
    public List<JobOffer> findByEntreprisename(@PathVariable ("entreprisename") String entreprisename ){
    	
    	return jobOfferRepository.findByEntreprisename(entreprisename);
    }
    @Override
    public JobOffer readJobOffer(){
        return readJobOffer();
    }
    
    @ResponseBody
    @GetMapping(path="/findMyOffer/{name}")
    public List<JobOffer> findByName(@PathVariable ("name") String name){
    	
    	return jobOfferRepository.findByName(name);
    }
}
