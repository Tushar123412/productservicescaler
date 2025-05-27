package com.project.project.controllers;


import com.project.project.models.Product;
import com.project.project.services.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

//    @Autowired
//    @Qualifier("FakeProductService")
    private ProductService productService;

    public ProductController(@Qualifier("DatabaseProductService") ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
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
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping("/")
    public Product createProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @PutMapping("/")
    public Product updateProduct(@RequestBody Product product) {
        return productService.updateProduct(product);
    }

    @DeleteMapping("/")
    public void deleteProduct(int id) {
        productService.deleteProduct(id);
    }
}
