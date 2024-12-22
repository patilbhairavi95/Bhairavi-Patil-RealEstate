package com.spring.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.spring.model.Service;


public interface ServiceRepo extends CrudRepository<Service, Integer> {
//	@Query("from Service where serviceCategory=?1")
	List<Service>findByServiceCategory(String serviceCategory);
}
