package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
@Data
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class JobOffer {
    @Id
    private String offreId;
    private String name;
   
	private String entreprisename;
    private String categorie;
    private String location;
    private String description;
    private int workTime;
    private double salary;
    private Date datePublishing;

    public String getOffreId() {
        return offreId;
    }

    public void setOffreId(String offreId) {
        this.offreId = offreId;
    }
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


  
    public String getEntreprisename() {
		return entreprisename;
	}

	public void setEntreprisename(String entreprisename) {
		this.entreprisename = entreprisename;
	}

	public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getDatePublishing() {
        return datePublishing;
    }

    public void setDatePublishing(Date datePublishing) {
        this.datePublishing = datePublishing;
    }

	public JobOffer(String offreId, String name, String entreprisename, String categorie, String location,
			String description, int workTime, double salary, Date datePublishing) {
		super();
		this.offreId = offreId;
		this.name = name;
		this.entreprisename = entreprisename;
		this.categorie = categorie;
		this.location = location;
		this.description = description;
		this.workTime = workTime;
		this.salary = salary;
		this.datePublishing = datePublishing;
	}

	@Override
	public String toString() {
		return "JobOffer [offreId=" + offreId + ", name=" + name + ", entreprisename=" + entreprisename + ", categorie="
				+ categorie + ", location=" + location + ", description=" + description + ", workTime=" + workTime
				+ ", salary=" + salary + ", datePublishing=" + datePublishing + "]";
	}



    
    
}
