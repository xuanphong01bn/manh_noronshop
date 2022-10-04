package com.example.noronshop.repository;

import com.example.noronshop.data.data.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill,Integer> {
}
