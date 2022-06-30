package com.example.demo.services;


import com.example.demo.dao.UserRepository;
import com.example.demo.entities.User;

import java.util.List;

public interface UserService {
    public void addUser(User user);

    public void removeUser(String userId);

    public void updateUser(User user);

    public User findUserByUserId(String userId);

    public List<User> getAllUsers();

    public void confirmAccount(String userId);


    public String VerifiedUser(User user);

}
