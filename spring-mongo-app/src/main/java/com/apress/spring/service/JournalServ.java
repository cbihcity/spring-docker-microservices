package com.apress.spring.service;

import com.apress.spring.domain.Journal;
import com.apress.spring.repository.JournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ihhe0417 on 5/12/2017.
 */
@Service
public class JournalServ {

    @Autowired
    JournalRepository repository;

    public List<Journal> findAll() {
        List<Journal> list = new ArrayList<>();
        repository.findAll().forEach(journal -> list.add(journal));
        return list;
    }

    public void insertData() throws ParseException {
        Journal j1 = new Journal("Get to know Spring Boot", "Today I will learn Spring Boot", "01/01/2016");
        Journal j2 = new Journal("Simple Spring Boot Project", "I will do my first Spring Boot Project", "01/02/2016");
        repository.save(j1);
        repository.save(j2);
    }

    public void deleteAll() {
        repository.delete(repository.findAll());
    }
}
