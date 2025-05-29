package com.project.project.inheritancedemo.mappedSuperClass;

import jakarta.persistence.Entity;

@Entity(name = "msc_mentor")
public class Mentor extends User{
    private Float avgRating;
    private String company;
}
