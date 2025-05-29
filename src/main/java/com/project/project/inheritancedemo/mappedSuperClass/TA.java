package com.project.project.inheritancedemo.mappedSuperClass;

import jakarta.persistence.Entity;

@Entity(name = "mps_ta")
public class TA extends User{
    private Float avgRating;
    private Integer noOfHR;
}
