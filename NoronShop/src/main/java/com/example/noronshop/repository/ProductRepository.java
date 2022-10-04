package com.example.noronshop.repository;

import com.example.noronshop.data.data.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
