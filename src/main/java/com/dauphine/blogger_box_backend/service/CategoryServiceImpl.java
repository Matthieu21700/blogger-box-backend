package com.dauphine.blogger_box_backend.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.dauphine.blogger_box_backend.model.Category;
import com.dauphine.blogger_box_backend.repositories.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService{
	private final CategoryRepository repository;
	
	public CategoryServiceImpl (CategoryRepository repository) {
		this.repository=repository;
	}
	@Override

	public java.util.List<Category> getAll(){
		return repository.findAll();
	}
	@Override
	public Category create (String name) {
		Category category = new Category (name);
		return repository.save(category);
	}
	@Override
	public Category updateName(UUID id,String name) {
		Category category = getById(id);
		if(category==null) {
			return null;
		}
		category.setName(name);
		return repository.save(category);
	}
	public boolean deleteById(UUID id) {
		repository.deleteById(id);
		return true ;
	}
	@Override
	public Category getById(UUID id) {
		return repository.findById(id).orElse(null);
	}
	
}
