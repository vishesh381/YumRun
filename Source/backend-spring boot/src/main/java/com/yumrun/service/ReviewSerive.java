package com.yumrun.service;

import java.util.List;

import com.yumrun.Exception.ReviewException;
import com.yumrun.model.Review;
import com.yumrun.model.User;
import com.yumrun.request.ReviewRequest;

public interface ReviewSerive {
	
    public Review submitReview(ReviewRequest review,User user);
    public void deleteReview(Long reviewId) throws ReviewException;
    public double calculateAverageRating(List<Review> reviews);
}
