package com.project.project.models;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.*;

import java.util.Date;

@Data
@Getter
@Setter
//@AllArgsConstructor
//@NoArgsConstructor
@MappedSuperclass
public abstract class BaseModel {
    @Id
    private Long id;
    private Date createdAt;
    private Date updatedAt;
}
