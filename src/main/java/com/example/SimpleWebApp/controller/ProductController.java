package com.example.SimpleWebApp.controller;

import com.example.SimpleWebApp.model.Product;
import com.example.SimpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getProducts(){
        return productService.getProducts();
    }

    @GetMapping("/products/{productId}")
    public Product getProduct(@PathVariable int productId){
        return productService.getProduct(productId);
    }

    @PostMapping("/products")
    public void createProduct(@RequestBody Product product){
        productService.addProduct(product);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product product){
        productService.updateProduct(product);
    }

    @DeleteMapping("/products/{productId}")
    public void deleteProduct(@PathVariable int productId){
        productService.deleteProduct(productId);
    }

}
