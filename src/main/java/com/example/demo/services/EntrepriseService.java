package com.example.demo.services;

import com.example.demo.entities.Entreprise;


import java.util.List;


public interface EntrepriseService {
    public String addEntr(Entreprise entreprise);

    public List<Entreprise> removeEntr(String entreprisename);

    public void updateEntr(Entreprise entreprise);

    public Entreprise findByEntreprisename(String entreprisename);

    public List<Entreprise> getAllEntreprise();
}










