package com.example.services;

import com.example.entities.Product;
import com.example.repositories.ProductRepository;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product find() {
        return this.productRepository.find();
    }

    @Override
    public List<Product> findAll() {
        return this.productRepository.findAll();
    }
}
