package com.example.noronshop.repository;

import com.example.noronshop.data.data.CategoryProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryProductRepository extends JpaRepository<CategoryProduct,Integer> {
}
