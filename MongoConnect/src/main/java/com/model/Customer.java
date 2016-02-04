/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import org.springframework.data.annotation.Id;

/**
 *
 * @author omer
 */
public class Customer {
    @Id
    private String id;
    private String ad;
    private String soyad;
    
    public Customer(){
        
    }

    public Customer(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
    
    
}
