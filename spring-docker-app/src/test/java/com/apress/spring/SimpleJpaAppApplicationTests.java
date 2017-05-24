package com.apress.spring;

import com.apress.spring.domain.Journal;
import com.apress.spring.repository.TitleRepository;
import com.apress.spring.service.JournalService;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleJpaAppApplicationTests {

    @Autowired
    TitleRepository titelrepo;
    @Autowired
    JournalService service;

    List<Journal> listOfJournal;

    @Before
    public void insert() throws ParseException {
        service.insertData();
        listOfJournal=service.findAll();
    }

    @Test
    public void checkInsertedData() {
        Assert.assertEquals(2,service.findAll().size());
    }

    @Test
    public void checkConsistedInsertedData() {
        Assert.assertEquals(listOfJournal,service.findAll());
    }

    @Test
    public void findByTitle() {
        Assert.assertEquals(listOfJournal.get(0).getTitle(),service.findJournalByTitle("Get to know Spring Boot").getTitle());
    }

    @Test
    public void checkDeleteAll() {
        service.deleteAll();
        Assert.assertEquals(0,service.findAll().size());
    }

    @Test
    public void contextLoads() {
    }

    @After
    public void deleteAll(){
        service.deleteAll();
    }
}
