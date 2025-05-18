package com.project.project.services;

import com.project.project.dtos.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class FakeProductService implements ProductService {

    @Autowired
    private RestTemplate restTemplate;

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
        int id = (int) productId;
        ProductDto productDto = restTemplate.getForEntity("https://fakestoreapi.com/products/" + id, ProductDto.class).getBody();
        return new ResponseEntity<>(productDto, HttpStatus.OK);
    }

    @Override
    public void deleteProduct(long productId) {

    }

    @Override
    public List<ProductDto> getAllProducts() {
        return List.of();
    }
}
