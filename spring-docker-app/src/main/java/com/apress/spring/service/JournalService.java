package com.apress.spring.service;

import com.apress.spring.domain.Journal;
import com.apress.spring.domain.Title;
import com.apress.spring.repository.JournalRepository;
import com.apress.spring.repository.TitleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ihhe0417 on 4/26/2017.
 */
@Service
public class JournalService {

    private static final Logger log = LoggerFactory.getLogger(JournalService.class);

    @Autowired
    JournalRepository repo;

    @Autowired
    TitleRepository titelrepo;

    public void insertData() throws ParseException {
        log.info("### > Inserting Data...");
        Title title = new Title();
        Journal j1 = new Journal("Get to know Spring Boot", "Today I will learn Spring Boot", "01/01/2016");
        Journal j2 = new Journal("Simple Spring Boot Project", "I will do my first Spring Boot Project", "01/02/2016");
        j2.setTitlet(title);
        j1.setTitlet(title);

        title.getList().add(j1);
        title.getList().add(j2);
        titelrepo.save(title);
        log.info("> Done.");
    }

    public List<Journal> findAll() {
        List<Journal> list = new ArrayList<>();
        repo.findAll().forEach(journal -> list.add(journal));
        return list;
    }

    public void deleteCustomJournal(String title) {

    }

    public void deleteAll() {
        repo.delete(repo.findAll());
    }
}
