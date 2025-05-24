package com.project.project.services;

import com.project.project.dtos.ProductDto;
import com.project.project.exception.ProductNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service("FakeProductService")
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
//        throw new RuntimeException("Not implemented yet");
//        int id = (int) productId;
//        ProductDto productDto = restTemplate.getForEntity("https://fakestoreapi.com/products/" + id, ProductDto.class).getBody();
//        return new ResponseEntity<>(productDto, HttpStatus.OK);
        throw new ProductNotFoundException("Product not found with product id " + productId);
    }

    @Override
    public void deleteProduct(long productId) {

    }

    @Override
    public List<ProductDto> getAllProducts() {
        ProductDto[] productDtos = restTemplate.getForEntity("https://fakestoreapi.com/products", ProductDto[].class).getBody();
        List<ProductDto> productDtoList = Arrays.asList(productDtos);

        return productDtoList;
    }
}
