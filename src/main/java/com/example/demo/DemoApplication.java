package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    /*@Bean
    public CommandLineRunner start(EntrepriseRepository entrepriseRepository) {
        return args -> {
            entrepriseRepository.deleteAll();
            Stream.of("130000 55822159 orange", "135000 55822654 ooreedo").forEach(c -> {
                EntrepriseRepository.save(new entreprise(Integer.parseInt(c.split(" ")[0]), Integer.parseInt(c.split(" ")[1]), c.split(" ")[2], 256985, true));
            });

            entrepriseRepository.findAll().forEach(System.out::println);
        };*/
    }
