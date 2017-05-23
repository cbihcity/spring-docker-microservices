package com.apress.spring;

import com.apress.spring.domain.Journal;
import com.apress.spring.domain.Title;
import com.apress.spring.repository.JournalRepository;
import com.apress.spring.repository.TitleRepository;
import com.apress.spring.service.JournalService;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleJpaAppApplicationTests {

    @Autowired
    JournalRepository repo;
    @Autowired
    TitleRepository titelrepo;
    @Autowired
    JournalService service;


    @Before
    public void insert() throws ParseException {
        Title title = new Title();
        Journal j1 = new Journal("Get to know Spring Boot", "Today I will learn Spring Boot", "01/01/2016");
        Journal j2 = new Journal("Simple Spring Boot Project", "I will do my first Spring Boot Project", "01/02/2016");
        j2.setTitlet(title);
        j1.setTitlet(title);

        title.getList().add(j1);
        title.getList().add(j2);
        titelrepo.save(title);
    }

    @Test
    public void checkInsertedData() {
        Assert.assertEquals("test",2,service.findAll().size());
    }

    @After
    public void deleteAll(){
        service.deleteAll();
    }

//    @Test
//    public void contextLoads() {
//    }

}
