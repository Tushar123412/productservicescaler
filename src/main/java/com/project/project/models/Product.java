package com.project.project.models;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product extends BaseModel {
    private String title;
    private Double price;
    private String description;
    private String image;
    private Category category;
}
