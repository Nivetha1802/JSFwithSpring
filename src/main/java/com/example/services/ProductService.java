package com.example.services;

import com.example.entities.Product;

import java.util.List;

public interface ProductService {

    public Product find();
    public List<Product> findAll();
}
