package com.project.project.controllers;

import com.project.project.dtos.ProductDto;
import com.project.project.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/{id}")
    public ResponseEntity<ProductDto> getProductById(@PathVariable Long id) {
       //throw new RuntimeException("No such product");
//        ResponseEntity<ProductDto> response = null;
//        try {
//            response = productService.getProduct(id);
//        } catch (RuntimeException e) {
//            response = new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }

        return productService.getProduct(id);
    }

    @GetMapping("/")
    public List<ProductDto> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping("/")
    public ProductDto createProduct(@RequestBody ProductDto productDto) {
        return productService.addProduct(productDto);
    }

    @PutMapping("/")
    public ProductDto updateProduct(@RequestBody ProductDto productDto) {
        return productService.updateProduct(productDto);
    }

    @DeleteMapping("/")
    public void deleteProduct(int id) {
        productService.deleteProduct(id);
    }
}
