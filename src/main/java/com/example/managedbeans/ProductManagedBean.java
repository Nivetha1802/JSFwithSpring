package com.example.managedbeans;

import com.example.entities.Product;
import com.example.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.List;

@Component
@ManagedBean(name="productManagedBean")
@SessionScoped
public class ProductManagedBean {

    @Autowired
    private ProductService productService;

    private Product product;
    private List<Product> products;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void onload(){
        this.products = productService.findAll();
        this.product = productService.find();
    }
}
