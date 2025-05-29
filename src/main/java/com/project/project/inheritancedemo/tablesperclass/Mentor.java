package com.project.project.inheritancedemo.tablesperclass;

import jakarta.persistence.Entity;

@Entity(name = "tpc_mentor")
public class Mentor extends User{
    private Float avgRating;
    private String company;
}
