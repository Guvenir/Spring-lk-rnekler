/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.config;

import com.dao.BookDaoImp;
import com.dao.UserDaoImp;
import com.model.Book;
import com.model.User;
import com.service.UsrService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author omer
 */
public class App {

    public static void main(String[] args) {
        List<User> u = new ArrayList<>();
        List<Book> b = new ArrayList<Book>();
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        UsrService usi = ac.getBean(UsrService.class);
        usi.saveUser(new User("omer", "guvenir"));
        u = usi.getAllUser();
        for (User us : u) {
            System.out.println(us.getName());
        }
    }
}
