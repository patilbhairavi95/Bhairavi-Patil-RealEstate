package com.spring.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.RegLogin;
import com.spring.repo.RegLoginRepo;

@CrossOrigin("*")
@RestController
public class RegLoginController {
	RegLogin regLogin;
	@Autowired
	RegLoginRepo repo;
	
		@PostMapping("/signup")
	    public RegLogin register(@RequestBody RegLogin regLogin) {
	       System.out.println("In register "+regLogin);
	       regLogin.setRole("user");
	        return repo.save(regLogin);
	    }

	   
		@GetMapping("/login/{user}/{pass}")
	    public Optional<RegLogin> login(@PathVariable("user") String user,@PathVariable("pass") int pass) {

	        System.out.println(user+"  "+pass);
	        Optional<RegLogin> dataLogin = repo.findByUsernameAndPassword(user, pass);

	        if (dataLogin.isPresent()) {
	        	System.out.println(dataLogin);
	            return dataLogin;
	        } else {
	            return dataLogin;
	        }
	    }
}
