package com.project.project.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductNotFoundException extends RuntimeException {

    private Long productId;

    public ProductNotFoundException(String message) {
        super(message);
    }

    public ProductNotFoundException(Long productId, String message) {
        super(message);
        this.productId = productId;
    }
}
