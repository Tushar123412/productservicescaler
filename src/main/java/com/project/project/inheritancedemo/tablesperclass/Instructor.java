package com.project.project.inheritancedemo.tablesperclass;

import jakarta.persistence.Entity;

@Entity(name = "tpc_instructor")
public class Instructor extends User{
    private String subject;
    private Integer noOfSessions;
}
