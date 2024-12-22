package com.spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.Service;
import com.spring.repo.ServiceRepo;
@RestController
@CrossOrigin("*")

public class ServiceController {
	@Autowired
	ServiceRepo repo;
	@GetMapping("/getallservices/{category}")
	public List<Service> services(@PathVariable String category){
		System.out.println(category);
		System.out.println(repo.findByServiceCategory(category));
		return (List<Service>) repo.findByServiceCategory(category);
		
		
	}
//	@GetMapping("/getallservicess/{category}")
//	public List<Service> services1(@PathVariable String category){
//		System.out.println(category);
//		System.out.println(repo.findByServiceCategory(category));
//		return (List<Service>) repo.findByServiceCategory(category);
//		
//		
//	}
	
	
	@GetMapping("/Service")
	public List<Service> services(){
		System.out.println(repo.findAll());
		return (List<Service>) repo.findAll();
		
		
	}
    @PostMapping("/Service")
    public String addServices(@RequestBody Service services) {
    	System.out.println(services);
    	repo.save(services);
		return "product";
    	
    	}
    
    @DeleteMapping("/Service/{id}")
    public boolean deleteServices(@PathVariable("id") int id) {
    	System.out.println("delete product b y id:" +id);
    	repo.deleteById(id);
		return true;
    	
    }
   @PutMapping("/Service")
    public Service updateServices(@RequestBody Service services) {
     System.out.println("update product :" +services);
  int sid=services.getServiceId();
  
  repo.findById(sid).map(
		  s->{
			  s.setServiceId(services.getServiceId());
			  s.setServiceName(services.getServiceName());
			  s.setServiceType(services.getServiceType());
			  s.setServiceCategory(services.getServiceCategory());
			  s.setServicePrice(services.getServicePrice());
			  s.setServiceDesc(services.getServiceDesc());
			  s.setServiceMeasure(services.getServiceMeasure());
			  s.setImg1(services.getImg1());
			  s.setImg2(services.getImg2());
			  s.setImg3(services.getImg3());
			  s.setImg4(services.getImg4());
		  
		  return  repo.save(services);
		  });
return services;
 
    	
 }
   
   @GetMapping("/Service/{id}")
   public Optional<Service> getDataById(@PathVariable("id") int id) {
   	System.out.println("delete product b y id:" +id);
   	
		return repo.findById(id);
   	
   }
   
}   