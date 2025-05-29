package com.project.project.services;

import com.project.project.exception.ProductNotFoundException;
import com.project.project.models.Category;
import com.project.project.models.Product;
import com.project.project.repositories.CategoryRepository;
import com.project.project.repositories.ProductRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("DatabaseProductService")
public class DatabaseProductService implements ProductService {

    private ProductRepository productRepository;
    private CategoryRepository categoryRepository;

    public DatabaseProductService(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Product addProduct(Product productDto) {

        if(productDto.getCategory() == null) {
            throw new ProductNotFoundException("Product without category not selected");
        }

        Optional<Category> category = categoryRepository.findByName(productDto.getCategory().getName());
        Product product = new Product();
        product.setTitle(productDto.getTitle());
        product.setDescription(productDto.getDescription());
        product.setPrice(productDto.getPrice());
        product.setImage(productDto.getImage());

        if(category.isPresent()) {
            product.setCategory(category.get());
        } else {
            Category newCategory = new Category();
            newCategory.setName(productDto.getCategory().getName());
            newCategory = categoryRepository.save(newCategory);
            product.setCategory(newCategory);
        }

        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        return null;
    }

    @Override
    public ResponseEntity<Product> getProduct(long productId) {
//        Optional<Product> product = productRepository.findById(productId);
//        if(!product.isPresent()) {
//            throw new ProductNotFoundException("Product with id " + productId + " not found");
//        }
//        return ResponseEntity.ok(product.get());
//        Product product = productRepository.getProductThroughId(productId);
        Product product = productRepository.getProductThroughIdNative(productId);
        return ResponseEntity.ok(product);
    }

    @Override
    public void deleteProduct(long productId) {

    }

    @Override
    public List<Product> getAllProducts() {

        return productRepository.findAll();
    }
}
