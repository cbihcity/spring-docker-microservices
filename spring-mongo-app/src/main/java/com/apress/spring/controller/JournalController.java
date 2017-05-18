package com.apress.spring.controller;

import com.apress.spring.domain.Journal;
import com.apress.spring.service.JournalServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ihhe0417 on 5/12/2017.
 */
@RestController
public class JournalController {

    @Autowired
    JournalServ service;

    @RequestMapping(name = "/info-mongo")
    public List<Journal> showJournal() {
        List<Journal> list = new ArrayList<>();
        list = service.findAll();
        return list;
    }

    @RequestMapping("/insert-mongo")
    public String home() throws ParseException {
        service.insertData();
        return "Data succesfully inserted!";
    }

    @RequestMapping("/del-mongo")
    public String del() throws ParseException {
        service.deleteAll();
        return "Data succesfully deleted!";
    }
}
