package com.example.demo.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Document
@Data
@AllArgsConstructor
@EqualsAndHashCode
public class Entreprise {
	@Id
	private String entreprisename;
 
   
    private String image;
    private String description;
    private List<String> staff;
    private String email;
    private String addresse;
    
    private int nbEmployee;
    private int telephone;

    @DBRef
    private Collection<JobOffer> jobOffers = new ArrayList<>();
    
    
    
    
	public String getEntreprisename() {
		return entreprisename;
	}
	public void setEntreprisename(String entreprisename) {
		this.entreprisename = entreprisename;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<String> getStaff() {
		return staff;
	}
	public void setStaff(List<String> staff) {
		this.staff = staff;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddresse() {
		return addresse;
	}
	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}
	public int getNbEmployee() {
		return nbEmployee;
	}
	public void setNbEmployee(int nbEmployee) {
		this.nbEmployee = nbEmployee;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	public Collection<JobOffer> getJobOffers() {
		return jobOffers;
	}
	public void setJobOffers(Collection<JobOffer> jobOffers) {
		this.jobOffers = jobOffers;
	}
	public Entreprise(String entreprisename, String image, String description, List<String> staff, String email,
			String addresse, int nbEmployee, int telephone, 
			Collection<JobOffer> jobOffers) {
		super();
		this.entreprisename = entreprisename;
		this.image = image;
		this.description = description;
		this.staff = staff;
		this.email = email;
		this.addresse = addresse;
		this.nbEmployee = nbEmployee;
		this.telephone = telephone;
		
		this.jobOffers = jobOffers;
	}
	@Override
	public String toString() {
		return "Entreprise [entreprisename=" + entreprisename + ", image=" + image + ", description=" + description
				+ ", staff=" + staff + ", email=" + email + ", addresse=" + addresse + ", nbEmployee=" + nbEmployee
				+ ", telephone=" + telephone + ", jobOffers=" + jobOffers + "]";
	}

	
	

   /*
    public Entreprise(int nbEmployee, int telephone, String image, int activationCode, boolean isEmailVerified) {
        this.nbEmployee = nbEmployee;
        this.telephone = telephone;
        this.image = image;
        this.activationCode = activationCode;
        this.isEmailVerified = isEmailVerified;
    }*/
}

  