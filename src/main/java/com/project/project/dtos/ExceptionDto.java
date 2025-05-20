package com.project.project.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExceptionDto {
    private String message;
    private Integer statusCode;
}
