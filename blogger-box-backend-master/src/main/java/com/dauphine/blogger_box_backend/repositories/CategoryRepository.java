package com.dauphine.blogger_box_backend.repositories;

import java.util.List;

import java.util.UUID;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dauphine.blogger_box_backend.model.Category;

public interface CategoryRepository extends JpaRepository<Category,UUID>{
	@Query("""
			Select category
			From Category category
			WHERE UPPER(category.name) LIKE UPPER(CONCAT('%', :name , '%'))
			""")
	List<Category> findAllLikeName(@Param("name") String name);
	}

