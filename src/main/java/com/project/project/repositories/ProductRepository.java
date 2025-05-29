package com.project.project.repositories;

import com.project.project.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query("select p from products p where p.id = :id")
    Product getProductThroughId(Long id);

    @Query(value = "select * from products where id = :id",nativeQuery = true)
    Product getProductThroughIdNative(Long id);
}
