/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.dao.UserDao;
import com.model.User;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author omer
 */
public class UsrService implements IUserService{
    
    @Autowired
    UserDao ud;
    
    private List<User> user = new ArrayList<>();
    
    public UsrService(){
        
    }

    @Override
    public void saveUser(User u) {
        ud.saveUser(u);
    }

    @Override
    public List<User> getAllUser() {
        user = ud.findAllUser();
        return user;
    }
}
