/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.config.HibernateUtil;
import com.model.Book;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

/**
 *
 * @author omer
 */
@Repository("BookDao")
public class BookDaoImp implements BookDao{
    
    private HibernateUtil hu;
    private Session ses;
    
    @Override
    public List<Book> getAllBook() {
        List<Book> b = new ArrayList<>();
        ses = hu.getSessionFactory().openSession();
        Query q = ses.createQuery("from Book");
        b = q.list();
        ses.close();
        return b;
    }
    
}
