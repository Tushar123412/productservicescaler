package com.project.project.inheritancedemo.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity(name = "st_ta")
@DiscriminatorValue(value = "TA")
public class TA extends User{
    private Float avgRating;
    private Integer noOfHR;
}
