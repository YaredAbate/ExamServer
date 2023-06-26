package com.example.examserver.service;

import com.example.examserver.model.User;
import com.example.examserver.model.UserRole;


import java.util.Set;

public interface UserService{
    //create user
    public User createUser(User user, Set<UserRole> userRoles) throws Exception;
    //get user by user name
    public User getUser(String username);
    //delete user by id
    public void deleteUser(Long userId);
}
