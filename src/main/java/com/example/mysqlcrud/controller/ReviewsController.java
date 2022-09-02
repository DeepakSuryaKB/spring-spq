package com.example.mysqlcrud.controller;

import com.example.mysqlcrud.entity.Product;
import com.example.mysqlcrud.entity.Reviews;
import com.example.mysqlcrud.serive.ProductService;
import com.example.mysqlcrud.serive.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ReviewsController {

    @Autowired
    private ReviewService reviewService;

    @Autowired
    private ProductService productService;

    @GetMapping("/reviews")
    public List<Reviews> getAllReviews(){
        return this.reviewService.getAllReviews();
    }


}
