package com.example.demo.models;

import java.time.Instant;
import lombok.Data;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

@Data
public abstract class AbstractModel {
 
    @Id
    private String id;
  	@CreatedDate 
    private Instant created;
	@CreatedBy 
    private String creator;
	@LastModifiedDate 
    private Instant modified;
	@LastModifiedBy 
    private String modifier;
}