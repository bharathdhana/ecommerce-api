package com.bharath.ecommerceapi.service.inf;

public interface IProductService {
    void getAllProducts();
    void getProductById();
    void getProductByCategory();
    void getProductByPriceRange();
    void searchProducts();
    void createProduct();
    void updateProduct();
    void deleteProduct();
}
