package com.project.project.services;

import com.project.project.dtos.ProductDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("DatabaseProductService")
public class DatabaseProductService implements ProductService {


    @Override
    public ProductDto addProduct(ProductDto productDto) {
        return null;
    }

    @Override
    public ProductDto updateProduct(ProductDto productDto) {
        return null;
    }

    @Override
    public ResponseEntity<ProductDto> getProduct(long productId) {
        return null;
    }

    @Override
    public void deleteProduct(long productId) {

    }

    @Override
    public List<ProductDto> getAllProducts() {
        return List.of();
    }
}
