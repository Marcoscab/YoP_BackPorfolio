
package com.porfolio.ms.service;

import com.porfolio.ms.model.User;
import com.porfolio.ms.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService implements IUserService{

    @Autowired
    private UserRepo userRepo;
    
    @Override
    public User findUserById(Long id) {
       return userRepo.findById(id).orElse(null);
    }
    
}
