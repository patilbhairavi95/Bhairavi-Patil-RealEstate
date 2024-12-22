package com.spring.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.spring.model.RegLogin;

public interface RegLoginRepo extends CrudRepository<RegLogin, Integer> {
	Optional<RegLogin> findByUsernameAndPassword(String Username, int  Password);

	
}
