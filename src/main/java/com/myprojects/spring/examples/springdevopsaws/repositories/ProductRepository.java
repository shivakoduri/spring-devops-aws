package com.myprojects.spring.examples.springdevopsaws.repositories;

import com.myprojects.spring.examples.springdevopsaws.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
