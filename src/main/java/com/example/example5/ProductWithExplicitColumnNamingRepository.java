package com.example.example5;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductWithExplicitColumnNamingRepository extends JpaRepository<Product, Integer> {

}
