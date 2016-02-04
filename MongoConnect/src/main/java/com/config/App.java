package com.config;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.dao.CustomerRepo;
import com.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 *
 * @author omer
 */
@EnableMongoRepositories(basePackages = "com.dao")
@EnableAutoConfiguration
public class App implements CommandLineRunner {

    @Autowired
    private CustomerRepo cr;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        cr.deleteAll();
        cr.save(new Customer("omer", "guvenir"));
        for (Customer c : cr.findAll()) {
            System.out.println(c.getAd());
        }
    }

}
