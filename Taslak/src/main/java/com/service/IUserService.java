/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.model.User;
import java.util.List;

/**
 *
 * @author omer
 */
public interface IUserService {
    void saveUser(User u);
    List<User> getAllUser();
}
