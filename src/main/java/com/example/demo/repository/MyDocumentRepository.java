package com.example.demo.repository;

import com.example.demo.models.MyDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MyDocumentRepository extends MongoRepository<MyDocument, String> {
    
}