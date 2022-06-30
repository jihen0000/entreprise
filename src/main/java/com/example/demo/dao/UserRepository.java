package com.example.demo.dao;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entities.User;



public interface UserRepository extends MongoRepository<User, String>{
    public  User findByUserId(String userId);
}
