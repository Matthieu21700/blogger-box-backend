package com.dauphine.blogger_box_backend.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.dauphine.blogger_box_backend.model.Category;
import com.dauphine.blogger_box_backend.model.Post;
import com.dauphine.blogger_box_backend.repositories.CategoryRepository;
import com.dauphine.blogger_box_backend.repositories.PostRepository;
@Service
public class PostServiceImpl implements PostService {
	private final PostRepository repository;
	private final CategoryRepository catRepo;
	public PostServiceImpl (PostRepository repository, CategoryRepository a) {
		this.repository=repository;
		this.catRepo=a;
	}
	@Override
	public List<Post> getAllByCategorieId(UUID categoryId) {
		return this.repository.findByCategory_id(categoryId);
	}
	@Override
	public List<Post> getAll() {
		return this.repository.findAllByOrderByCreatedDateDesc();
	}
	@Override
	public Post getById(UUID id) {
		return this.repository.findById(id).orElse(null);
	}
	@Override
	public Post create(String title, String content, UUID categoryId) {
		Category cat =catRepo.getById(categoryId);
		Post post = new Post (title, content,cat);
		System.out.println("Reçu : " + title + ", " + content + ", " + categoryId);
		return repository.save(post);
	}
	@Override
	public Post update(UUID id, String title, String content) {
		Post post =repository.getById(id);
		if(post==null) {
			return null;
		}else {
			post.setTitle(title);
			post.setContent(content);
			return repository.save(post);
		}
	}
	@Override
	public boolean deleteById(UUID id) {
		repository.deleteById(id);
		return true;
	}
}
