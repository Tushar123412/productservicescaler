package com.project.project.inheritancedemo.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity(name = "st_mentor")
@DiscriminatorValue(value = "Mentor")
public class Mentor extends User{
    private Float avgRating;
    private String company;
}
