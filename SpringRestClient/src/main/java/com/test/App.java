/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import org.springframework.web.client.RestTemplate;

/**
 *
 * @author omer
 */
public class App {
    public static void main(String[] args) {
        RestTemplate rt = new RestTemplate();
        Omdb o = rt.getForObject("http://www.omdbapi.com/?t=batman&y=&plot=short&r=json", Omdb.class);
        //String s = rt.getForObject("http://www.omdbapi.com/?t=batman&y=&plot=short&r=json", String.class);
        System.out.println(o.getTitle() +"-- "+o.getActors()+"--"+o.getYear());
    }
}
