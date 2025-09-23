package com.example.SimpleWebApp.service;

import com.example.SimpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    List<Product> productList;

    public ProductService() {
        productList = new ArrayList<>(List.of(new Product[]{new Product(101, "Iphone", 50000), new Product(102, "Bottle", 200)}));
    }

    public List<Product> getProducts(){
        return productList;
    }

    public Product getProduct(int productId){
        return productList.stream().filter(prod -> prod.getProdId() == productId).findFirst().orElse(null);
    }

    public void addProduct(Product product){
        this.productList.add(product);
    }
}
