package com.yumrun.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yumrun.model.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {
	PasswordResetToken findByToken(String token);
}
