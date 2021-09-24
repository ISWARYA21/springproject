package com.sprintaws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sprintaws.entity.Category;
import com.sprintaws.service.CategoryServiceImpl;
@RestController
public class CategoryController {
	
	@Autowired
	CategoryServiceImpl catService;
	
	@PostMapping("/category")
	public void addCategory(@RequestBody Category cat) {	
		catService.addCategory(cat);
	}
	
	
	@GetMapping("/category")
	 public List<Category> getAllCategorys(){
		return catService.getAllCategory();
	}
	
	
    @GetMapping("/category/{catid}") 
	  public Category getCategorybyId(@PathVariable("catid")int catid) { 
		  return catService.viewCategory(catid);
	   }
    
    
	@DeleteMapping("/category/{catid}") 
	 public void deleteCategory(@PathVariable int catid) {
		 catService.removeCategory(catid);
	  }
	  
	
	@PutMapping("/category")
	 public Category updateCategory(@RequestBody Category cat) {
		return catService.updateCategory(cat);
	}

}

