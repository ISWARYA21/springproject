package com.sprintaws.service;

import java.util.List;

//import org.springframework.stereotype.Service;

import com.sprintaws.entity.Category;


public interface CategoryService {
	public Category addCategory(Category cat);
	public Category updateCategory(Category cat);
	public void removeCategory(int catid);
	public Category viewCategory(int catid);
	public List<Category> viewAllCategory();
	public List<Category> getAllCategory();
	
	
	
}
