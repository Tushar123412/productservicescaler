package com.project.project.inheritancedemo.mappedSuperClass;

import jakarta.persistence.Entity;

@Entity(name = "msc_instructor")
public class Instructor extends User{
    private String subject;
    private Integer noOfSessions;
}
