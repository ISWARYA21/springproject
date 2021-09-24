package com.sprintaws.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sprintaws.entity.Category;

public interface ICategoryRepository extends JpaRepository<Category,Integer>{

}
