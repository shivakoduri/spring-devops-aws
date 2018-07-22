package com.myprojects.spring.examples.springdevopsaws.services;

import com.myprojects.spring.examples.springdevopsaws.domain.Product;

import java.util.List;

public interface ProductService {

    Product getProduct(Integer id);

    List<Product> listProducts();
}
