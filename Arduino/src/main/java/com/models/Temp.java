/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.models;

import org.springframework.data.annotation.Id;

/**
 *
 * @author omer
 */
public class Temp {
    @Id
    private String id;
    private String temp;
    private String date;

    public Temp() {
    }

    public Temp(String temp, String date) {
        this.temp = temp;
        this.date = date;
    }

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
}
