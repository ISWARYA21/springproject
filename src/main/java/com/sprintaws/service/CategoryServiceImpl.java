package com.sprintaws.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprintaws.dao.ICategoryRepository;

import com.sprintaws.entity.Category;

@Service
public class CategoryServiceImpl implements CategoryService{
	
@Autowired
private ICategoryRepository repository;

	@Override
	public Category addCategory(Category cat) {
		return repository.save(cat);
	}
	
	@Override
	public Category updateCategory(Category cat) {
		Category category = repository.findById(cat.getCatid()).orElseThrow(
				()-> new EntityNotFoundException("No Food Category found by the id"));
		category.setCategoryName(cat.getCategoryName());
		return repository.save(category);
	}

	@Override
	public void removeCategory(int catid) {
	     Category category = repository.findById(catid).orElseThrow(
	    		 ()-> new EntityNotFoundException(" No Food Category found"));
	     repository.delete(category);
		
	}

	@Override
	public List<Category> viewAllCategory() {
		// TODO Auto-generated method stub
		return (List<Category>)repository.findAll();
	}

	@Override
	public Category viewCategory(int catid) {
		Category category = repository.findById(catid).orElseThrow( 
				() -> new EntityNotFoundException("No Category found by the id"));
		return category;
	}

	@Override
	public List<Category> getAllCategory() {
		return  (List<Category>)repository.findAll();
	}

	
}
