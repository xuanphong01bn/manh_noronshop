package com.example.noronshop.repository;

import com.example.noronshop.data.data.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
