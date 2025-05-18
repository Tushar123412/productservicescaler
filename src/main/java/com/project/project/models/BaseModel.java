package com.project.project.models;

import lombok.*;

import java.util.Date;

@Data
@Getter
@Setter
//@AllArgsConstructor
//@NoArgsConstructor
public abstract class BaseModel {
    private Long id;
    private Date createdAt;
    private Date updatedAt;
}
