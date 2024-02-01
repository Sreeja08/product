package com.example.nxttrendz1.repository;

import java.util.ArrayList;

import com.example.nxttrendz1.model.Review;

public interface ReviewRepository {

    ArrayList<Review> getReviews();

    Review getReviewById(int reviewId);

    Review addReview(Review review);

    Review updateReview(int reviewId, Review review);

    void deleteReviewById(int reviewId);

}
