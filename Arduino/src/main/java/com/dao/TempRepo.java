/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.models.Temp;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author omer
 */
public interface TempRepo extends MongoRepository<Temp, String>{
    
}
