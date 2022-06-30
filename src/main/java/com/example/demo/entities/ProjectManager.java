package com.example.demo.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
@ToString
public class ProjectManager {
    @Id
    private String projectManagerId;
    private String projectManagerFullName;
    @DBRef
    private Entreprise entreprise;
}
