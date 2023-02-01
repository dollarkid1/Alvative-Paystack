package com.example.Alvative.repository.repository;

import com.example.demo.repository.models.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

    @Query("from restaurant r where r.account.accountId = :accountId")
    Restaurant getRestaurantByAccount(@Param("accountId") Long accountId);
}
