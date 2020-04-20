package com.example.example3;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductWithBasicAnnotationRepository extends JpaRepository<Product, Integer> {

}
