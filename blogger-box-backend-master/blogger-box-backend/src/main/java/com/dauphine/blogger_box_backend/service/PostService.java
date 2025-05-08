package com.dauphine.blogger_box_backend.service;

import java.util.List;
import java.util.UUID;

import com.dauphine.blogger_box_backend.model.Post;

public interface PostService {
	List<Post> getAllByCategorieId(UUID categoryId);
	List<Post> getAll();
	Post getById(UUID id);
	Post create(String title , String content, UUID categoryId);
	Post update(UUID id, String title, String content);
	boolean deleteById(UUID id);
}
