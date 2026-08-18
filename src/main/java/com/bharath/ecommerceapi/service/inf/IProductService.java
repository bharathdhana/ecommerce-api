package com.bharath.ecommerceapi.service.inf;

import com.bharath.ecommerceapi.model.dto.request.ProductRequest;

public interface IProductService {
    void getAllProducts();
    void getProductById(Long id);
    void getProductByCategory(String category);
    void getProductByPriceRange(Double minPrice, Double maxPrice);
    void searchProducts(String keyword);
    void createProduct(ProductRequest request);
    void updateProduct(Long id, ProductRequest request);
    void deleteProduct(Long id);
}
