package com.project.project.inheritancedemo.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity(name = "st_instructor")
@DiscriminatorValue(value = "Instructor")
public class Instructor extends User{
    private String subject;
    private Integer noOfSessions;
}
