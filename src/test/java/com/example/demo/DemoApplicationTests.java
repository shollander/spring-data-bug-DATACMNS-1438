package com.example.demo;

import com.example.demo.models.*;
import com.example.demo.repository.MyDocumentRepository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    
    @Autowired
    private MyDocumentRepository repository;

	@Test
	public void test() {
	    MyDocument doc = new MyDocument();
	    MyDocument saved = repository.save(doc);
	    
	    repository.save(saved);
	}

}
