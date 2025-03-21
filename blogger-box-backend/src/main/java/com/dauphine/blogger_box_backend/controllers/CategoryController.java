package com.dauphine.blogger_box_backend.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import com.dauphine.blogger_box_backend.model.*;

@RestController
public class CategoryController {

	
	@GetMapping("/categories")
	public List<Category> getAllCategories() {
		return null;}
	
	
	 @GetMapping("/categories/{id}")
	 public Category getCategoryById(@PathVariable Long id) {
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
