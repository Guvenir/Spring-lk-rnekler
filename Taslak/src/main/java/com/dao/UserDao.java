/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.User;
import java.util.List;

/**
 *
 * @author omer
 */
/*User Tablosu üzerindeki yapılacak işlemlerin listesi*/
public interface UserDao {
    User findById(int id);
    User findByUsername(String username);
    void saveUser(User user);
    void deleteUser(User user);
    List<User> findAllUser();
}
