package com.example.mysqlcrud.repository;

import com.example.mysqlcrud.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product,Integer> {

    Product findByName(String name);
}
