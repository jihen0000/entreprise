package com.example.demo.services;

import com.example.demo.entities.JobOffer;


import java.util.List;

public interface JobOfferService {
    public String addJob(JobOffer jobOffer);

    public List<JobOffer> removeJob(String offreId);

    public void updateJob(JobOffer jobOffer);

    public JobOffer findJobByOffreId(String offreId);

    public List<JobOffer> getAllJobOffers();

    public JobOffer readJobOffer();
}
