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
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author omer
 */
@Configuration
@ComponentScan(basePackages = "com")
public class AppConfig {

    @Bean
    public UsrService getUsrService(){
        return new UsrService();
    }
    
}
