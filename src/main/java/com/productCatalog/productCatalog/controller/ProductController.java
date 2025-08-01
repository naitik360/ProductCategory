package com.productCatalog.productCatalog.controller;


import com.productCatalog.productCatalog.dto.ProductDTO;
import com.productCatalog.productCatalog.entity.Product;
import com.productCatalog.productCatalog.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping
    public Product addProduct(@RequestBody ProductDTO productDTO)
    {
        return service.addProduct(productDTO);
    }

    @GetMapping
    public List<Product> getAll()
    {
        return service.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable Long id)
    {
        return service.getProductById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id)
    {
         service.deleteProduct(id);
    }

    @GetMapping("/search")
    public List<Product> search(@RequestParam String name)
    {
        return service.searchProductsByName(name);
    }

}
