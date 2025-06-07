package com.yumrun.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yumrun.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

}
