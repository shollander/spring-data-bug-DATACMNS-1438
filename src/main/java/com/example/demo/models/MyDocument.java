package com.example.demo.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@EqualsAndHashCode(callSuper=true)
public class MyDocument extends MyModel {
    
    private String name;
}