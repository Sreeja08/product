package com.example.nxttrendz1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

import com.example.nxttrendz1.model.Review;
import com.example.nxttrendz1.service.ReviewJpaService;

@RestController
public class ReviewController {

    @Autowired
    public ReviewJpaService reviewJpaService;

    @GetMapping("/products/reviews")
    public ArrayList<Review> getReviews() {
        return reviewJpaService.getReviews();
    }

    @GetMapping("/products/reviews/{reviewId}")
    public Review getReviewById(@PathVariable("reviewId") int reviewId) {
        return reviewJpaService.getReviewById(reviewId);
    }

    @PostMapping("/products/reviews")
    public Review addReview(@RequestBody Review review) {
        return reviewJpaService.addReview(review);
    }
}