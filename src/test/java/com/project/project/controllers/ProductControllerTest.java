package com.project.project.controllers;

import com.project.project.exception.ProductNotFoundException;
import com.project.project.models.Product;
import com.project.project.services.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
class ProductControllerTest {

    @MockitoBean(name = "fakeProductService")
    private ProductService productService;

    @Autowired
    private ProductController productController;

    @Test
    public void test_getProductByIdPositiveScenario() {
        //arrange
        long productId = 1;
        Product product = new Product();
        product.setId(productId);
        product.setTitle("IPhone 6");
        product.setDescription("IPhone best Phone");
        product.setPrice(45000.0);


        when(productService.getProduct(1l)).thenReturn(ResponseEntity.ok(product));
        //act
        Product actualProduct = productController.getProductById(1l).getBody();
//        actualProduct.setId(2l);

        //assert
        assertEquals(product, actualProduct,"expected Product and actual product are not equals");
        assertEquals(productId,actualProduct.getId(),"expect product and actuals product id are not equals");

    }

    @Test
    public void test_getProductByIdNegativeScenario() {
        long productId = -1;
        Product product = new Product();
        product.setId(productId);
        product.setTitle("IPhone 6");
        product.setDescription("IPhone best Phone");
        product.setPrice(45000.0);

        ProductNotFoundException expectedException = new ProductNotFoundException("product not found with product id " + productId);

        when(productService.getProduct(productId)).thenThrow(expectedException);

        Exception actualexception = assertThrows(ProductNotFoundException.class, () -> productController.getProductById(productId).getBody());

        assertEquals("Product not found with product id " + productId, actualexception.getMessage(),"Exception message is incorrect");
    }

}