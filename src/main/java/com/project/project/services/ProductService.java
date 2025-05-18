package com.project.project.services;

import com.project.project.dtos.ProductDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductService {
    public ProductDto addProduct(ProductDto productDto);
    public ProductDto updateProduct(ProductDto productDto);

    public ResponseEntity<ProductDto> getProduct(long productId);
    public void deleteProduct(long productId);
    public List<ProductDto> getAllProducts();
}
