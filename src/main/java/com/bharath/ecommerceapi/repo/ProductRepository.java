package com.bharath.ecommerceapi.repo;

import com.bharath.ecommerceapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCategory(String category);

    @Query("select p from Product p where p.price between ?1 and ?2")
    List<Product> findByPriceRange(Double minPrice, Double maxPrice);

    List<Product> findByTitleContainingIgnoreCaseOrDescriptionContainingIgnoreCase(String keyword, String keyword1);
}
