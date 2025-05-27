package com.project.project.services;


import com.project.project.exception.ProductNotFoundException;
import com.project.project.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
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
    public Product addProduct(Product product) {
        return null;
    }

    @Override
    public Product updateProduct(Product product) {
        return null;
    }

    @Override
    public ResponseEntity<Product> getProduct(long productId) {
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
    public List<Product> getAllProducts() {
        Product[] productDtos = restTemplate.getForEntity("https://fakestoreapi.com/products", Product[].class).getBody();
        List<Product> productDtoList = Arrays.asList(productDtos);

        return productDtoList;
    }
}
