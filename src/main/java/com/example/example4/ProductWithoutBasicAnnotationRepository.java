package com.example.example4;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductWithoutBasicAnnotationRepository extends JpaRepository<Product, Integer> {

}
