package com.example.demo.implementation;


import com.example.demo.services.UserService;
import com.example.demo.dao.UserRepository;
import com.example.demo.entities.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserServiceImpl implements UserService {

    @Autowired
    public UserRepository userRepository;

    @Override
    public void addUser(User user){
        System.out.println("In addUser : ");
        userRepository.save(user);
        System.out.println("Out of addUser : ");
    }

    @Override
    public void removeUser(String userId){
        System.out.println("In removeColl : ");
        userRepository.deleteById(userId);
        System.out.println("Out of removeColl : ");
    }

    public void updateUser(User user){
        user = userRepository.findByUserId(user.getUserId());
        user.setUserName(user.getUserName());
        user.setPassword(user.getPassword());
        user.setUserCountry(user.getUserCountry());
        user.setUserMail(user.getUserMail());
        userRepository.save(user);
    }

    @Override
    public User findUserByUserId(String userId){
        return userRepository.findByUserId(userId);
    }

    @Override
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @Override
    public void confirmAccount(String userId){
        User u= userRepository.findByUserId(userId);
        u.setEmailVerified(true);
        userRepository.save(u);


    }

    @Override
    public String VerifiedUser(User user){
        user.setEmailVerified(true);
        userRepository.save(user);
        return user.getUserId();

    }
}
