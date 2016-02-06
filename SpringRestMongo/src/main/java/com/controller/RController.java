/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.dao.CustomerRepo;
import com.model.Customer;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author omer
 */
@RestController
@RequestMapping("/test")
public class RController {
    
    @Autowired
    private CustomerRepo cr;
    
    @RequestMapping("/test")
    public String test(){
        return "deneme başarılı";
    }
    
    @RequestMapping("/customers")
    public List<Customer> getAllCustomer(){
        return cr.findAll();
    }
    
    @RequestMapping("/save")
    public void saveCustomer(){
        for(int i = 0; i < 1000;i++){
            cr.save(new Customer("omer"+i, "guvenir"+i));
        }
    }
    
    @RequestMapping("/delete")
    public void deleteAllCustomer(){
        cr.deleteAll();
    }
}
