package com.myprojects.spring.examples.springdevopsaws.repositories;

import com.myprojects.spring.examples.springdevopsaws.domain.ProductCategory;
import org.springframework.data.repository.CrudRepository;

public interface ProductCategoryRepository extends CrudRepository<ProductCategory, Integer> {
}
