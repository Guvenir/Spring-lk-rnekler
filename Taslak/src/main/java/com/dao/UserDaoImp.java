/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.config.HibernateUtil;
import com.model.User;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author omer
 */
@Repository
public class UserDaoImp implements UserDao{
    
    private HibernateUtil hu;
    private Session ses;
    
    public UserDaoImp(){
    }

    @Override
    public User findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User findByUsername(String username) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /*Kayıt esnasında transaction kullanılmalı*/
    @Override
    public void saveUser(User user) {
        ses = hu.getSessionFactory().openSession();
        ses.beginTransaction();
        ses.save(user);
        ses.getTransaction().commit();
        ses.close();
        System.out.println("kayıt başarılı");
    }

    @Override
    public void deleteUser(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> findAllUser() {
        List<User> u = new ArrayList<>();
        ses = hu.getSessionFactory().openSession();
        Query q = ses.createQuery("from User");
        u = q.list();
        ses.close();
        return u;
    }
    
}
