package com.myprojects.spring.examples.springdevopsaws.repositories;

import com.myprojects.spring.examples.springdevopsaws.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Integer> {
}
