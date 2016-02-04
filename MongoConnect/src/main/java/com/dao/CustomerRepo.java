/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.Customer;
import com.model.Customer;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author omer
 */
public interface CustomerRepo extends MongoRepository<Customer, String>{
    //public Customer findByFirstName(String firstName);
    //public List<Customer> findByLastName(String lastName);
}
