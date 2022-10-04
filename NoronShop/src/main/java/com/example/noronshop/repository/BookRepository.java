package com.example.noronshop.repository;

import com.example.noronshop.data.data.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
