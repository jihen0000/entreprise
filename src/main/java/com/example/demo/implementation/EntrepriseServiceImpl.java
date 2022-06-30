package com.example.demo.implementation;
import com.example.demo.entities.Entreprise;



import com.example.demo.services.EntrepriseService;
import com.example.demo.services.UserService;


import com.example.demo.dao.EntrepriseRepository;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EntrepriseServiceImpl implements EntrepriseService {

    @Autowired
    public EntrepriseRepository entrepriseRepository;
    
    public EntrepriseService entrepriseService;
    
    @Override
    @ResponseBody
    @PostMapping(path="/addEntreprise")

    
    public String addEntr(@RequestBody Entreprise entreprise) {

        System.out.println("In addEntr : ");
        entrepriseRepository.save(entreprise);
        System.out.println("Out of addEntr : ");
        return"200";
    }

    @Override
    public List<Entreprise> removeEntr(String entreprisename) {
        System.out.println("In removeEntr : ");
        entrepriseRepository.deleteById(entreprisename);
        System.out.println("Out of removeEntr : ");
        return entrepriseRepository.findAll();
    }

    @Override
    public void updateEntr(Entreprise entreprise) {
    	/*
       
        entreprise.setImage(entreprise.getImage());
        entreprise.setActivationCode(entreprise.getActivationCode());
        entreprise.setEmailVerified(entreprise.isEmailVerified());
        entreprise.setIntroduction(entreprise.getIntroduction());
        entreprise.setNbEmployee(entreprise.getNbEmployee());
        entreprise.setTelephone(entreprise.getTelephone());
        entreprise.setProjectManagers(entreprise.getProjectManagers());
        */
        entrepriseRepository.save(entreprise);
    }

    @Override
    public Entreprise findByEntreprisename(String entreprisename) {
        return entrepriseRepository.findByEntreprisename(entreprisename);
    }

    @Override
    public List<Entreprise> getAllEntreprise() {
        return entrepriseRepository.findAll();
    }
    
    
   

}
