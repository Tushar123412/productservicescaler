package com.project.project.models;

import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@Entity(name = "categories")
public class Category extends BaseModel {
    private String name;
}
