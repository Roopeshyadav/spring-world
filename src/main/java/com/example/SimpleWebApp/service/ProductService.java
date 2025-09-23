package com.example.SimpleWebApp.service;

import com.example.SimpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    public List<Product> getProducts(){
        return List.of(new Product(101, "Iphone", 50000), new Product(102, "Bottle", 200));
    }
}
