package com.project.project.services;

import com.project.project.models.Product;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductService {
    public Product addProduct(Product product);
    public Product updateProduct(Product product);

    public ResponseEntity<Product> getProduct(long productId);
    public void deleteProduct(long productId);
    public List<Product> getAllProducts();
}
