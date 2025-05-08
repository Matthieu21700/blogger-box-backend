package com.dauphine.blogger_box_backend.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import com.dauphine.blogger_box_backend.model.*;
import com.dauphine.blogger_box_backend.service.CategoryService;

@RestController
public class CategoryController {
	private CategoryService service;
	 public CategoryController(CategoryService service) {
	        this.service = service;
	    }
	@GetMapping("/categories")
	public List<Category> getAllCategories() {
		return this.service.getAll();}
	
	
	 @GetMapping("/categories/{id}")
	 public Category getById(@PathVariable Long id) {
		return null;}
	 
	 @PostMapping("/categories")
	 public Category createCategory(){
		 return null;
	 }
	 @PutMapping("/categories/{id}")
	    public Category updateCategoryName() {
		 return null;
	 }
	 @DeleteMapping("/categories/{id}")
	    public void deleteCategory(@PathVariable Long id) {
		 
	 }
}
