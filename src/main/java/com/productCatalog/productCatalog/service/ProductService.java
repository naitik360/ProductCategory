package com.productCatalog.productCatalog.service;

import com.productCatalog.productCatalog.dto.ProductDTO;
import com.productCatalog.productCatalog.entity.Product;

import java.util.List;

public interface ProductService {
    Product addProduct(ProductDTO productDTO);
    List<Product> getAllProducts();
    Product getProductById(Long id);
    void deleteProduct(Long id);
    List<Product> searchProductsByName(String name);
}
