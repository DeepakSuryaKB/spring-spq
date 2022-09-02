package com.example.mysqlcrud.repository;

import com.example.mysqlcrud.entity.Reviews;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Reviews,Long> {
}
