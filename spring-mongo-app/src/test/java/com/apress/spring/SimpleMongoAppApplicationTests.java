package com.apress.spring;

import com.apress.spring.domain.Journal;
import com.apress.spring.service.JournalServ;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleMongoAppApplicationTests {

    @Autowired
    JournalServ journalServ;

    List<Journal> listOfJournal;

    @Before
    public void insert() throws ParseException {
        journalServ.insertData();
        listOfJournal=new ArrayList<>(journalServ.findAll());
    }

    @Test
    public void checkInsertedData() {
        Assert.assertEquals(2,journalServ.findAll().size());
    }

    @Test
    public void checkConsistedInsertedData() {
        Assert.assertEquals(listOfJournal,journalServ.findAll());
    }

    @Test
    public void findByTitle() {
        Assert.assertEquals(listOfJournal.get(1).getTitle(),journalServ.findJournalByTitle("Simple Spring Boot Project").getTitle());
    }

    @Test
    public void checkDeleteAll() {
        journalServ.deleteAll();
        Assert.assertEquals(0,journalServ.findAll().size());
    }

    @Test
    public void contextLoads() {
    }

    @After
    public void deleteAll(){
        journalServ.deleteAll();
    }
}
