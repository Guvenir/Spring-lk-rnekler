/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controllers;

import com.dao.TempRepo;
import com.models.Temp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author omer
 */
@RestController
@RequestMapping("/arduino")
public class TempController {

    @Autowired
    private TempRepo tr;

    @RequestMapping(value = "/test", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public String test() {
        return "test başarılı";
    }

    @RequestMapping(value = "/testsave", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void testSave() {
        tr.save(new Temp("test", "12.02.2016"));
    }

    @RequestMapping(value = "/save/{temp}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public String save(@PathVariable("temp") String temp) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ") {
            public StringBuffer format(Date date, StringBuffer toAppendTo, java.text.FieldPosition pos) {
                StringBuffer toFix = super.format(date, toAppendTo, pos);
                return toFix.insert(toFix.length() - 2, ':');
            }
        ;
        };
    // Usage:
    System.out.println(dateFormat.format(new Date()));
        tr.save(new Temp(temp, dateFormat.format(new Date())));
        return temp + " " + dateFormat.format(new Date());
    }
    
    @RequestMapping(value = "/temp",method = RequestMethod.GET , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public List<Temp> getAllTemp(){
        return tr.findAll();
    }
}
