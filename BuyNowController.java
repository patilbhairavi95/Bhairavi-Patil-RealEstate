package com.spring.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.spring.model.BuyNow;
import com.spring.repo.BuyNowRepo;


@RestController
@CrossOrigin("*")
public class BuyNowController {
	@Autowired
	 BuyNowRepo buyNowRepo;
	@GetMapping("/BuyNow/{username}")
	public List<BuyNow> booking(@PathVariable("username") String username){
		System.out.println(username);
		System.out.println(buyNowRepo.findByUsername(username));
		return buyNowRepo.findByUsername(username);
		
		
	}
    @PostMapping("/BuyNow/{username}")
    public String addBooking(@PathVariable("username") String username,@RequestBody BuyNow buyNow) {
    	System.out.println(buyNow);
    	buyNow.setUsername(username);
    	buyNowRepo.save(buyNow);
     	return "BuyNow";
		
    	
    	}
    
    
}
