package com.example.config;

import com.example.repositories.ProductRepository;
import com.example.repositories.ProductRepositoryImpl;
import com.example.services.ProductService;
import com.example.services.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.example")
public class AppConfig {


    public ProductRepository productRepository(){
        return new ProductRepositoryImpl();
    }

    @Bean
    public ProductService productService(){
        return new ProductServiceImpl(productRepository());
    }
}
