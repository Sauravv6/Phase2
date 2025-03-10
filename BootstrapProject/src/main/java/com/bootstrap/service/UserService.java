package com.bootstrap.service;


import java.util.List;

import com.bootstrap.entity.User;

public interface UserService {
    List<User> getAllUsers();
    void saveUser(User user);
    User getUserById(Long id);
    void deleteUser(Long id);
    
}
