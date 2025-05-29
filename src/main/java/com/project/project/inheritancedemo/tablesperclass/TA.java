package com.project.project.inheritancedemo.tablesperclass;

import jakarta.persistence.Entity;

@Entity(name = "tpc_ta")
public class TA extends User{
    private Float avgRating;
    private Integer noOfHR;
}
