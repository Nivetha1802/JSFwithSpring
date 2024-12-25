package com.example.repositories;

import com.example.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {


    @Override
    public Product find() {
        return new Product(101, "Anu", 100);
    }

    @Override
    public List<Product> findAll() {
        List<Product> Products = new ArrayList<Product>();
        Products.add(new Product(101, "Anu", 100));
        Products.add(new Product(102, "Banu", 200));
        Products.add(new Product(103, "Cami", 300));
        return Products;
    }
}
