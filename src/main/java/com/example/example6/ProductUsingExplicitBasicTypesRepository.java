package com.example.example6;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductUsingExplicitBasicTypesRepository extends JpaRepository<Product, Integer> {

}
