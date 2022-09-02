package com.example.mysqlcrud.serive;

import com.example.mysqlcrud.entity.Reviews;
import com.example.mysqlcrud.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {


    @Autowired
    private ReviewRepository reviewRepository;

    public Reviews saveReview(Reviews reviews){
        return reviewRepository.save(reviews);

    }

    public List<Reviews> getAllReviews(){
        return this.reviewRepository.findAll();
    }
}
