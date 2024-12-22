package com.spring.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.spring.model.BuyNow;



public interface BuyNowRepo extends JpaRepository<BuyNow, Integer> {
	@Query("from BuyNow where  username=?1 ")
	 List<BuyNow> findByUsername(String username);
	}

