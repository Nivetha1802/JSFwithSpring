package com.example.repositories;

import com.example.entities.Product;

import java.util.List;

public interface ProductRepository {

    public Product find();
    public List<Product> findAll();
}
