package com.nishasoni.repository;

import com.nishasoni.model.Coupon;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponRepository extends JpaRepository<Coupon, Long> {
}
