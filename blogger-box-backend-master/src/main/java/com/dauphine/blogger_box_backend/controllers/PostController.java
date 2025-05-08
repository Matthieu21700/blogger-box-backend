package com.dauphine.blogger_box_backend.controllers;
import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import com.dauphine.blogger_box_backend.model.*;
import com.dauphine.blogger_box_backend.service.CategoryService;
import com.dauphine.blogger_box_backend.service.PostService;

@RestController
public class PostController {
	
	private PostService service;
	public PostController(PostService service) {
        this.service = service;
    }
	@PostMapping("/posts")
    public Post createPost(@RequestBody Post post) {
        return service.create(post.getTitle(), post.getContent(), post.getCategory().getId());
    }

    // Mettre à jour un post existant
    @PutMapping("/posts/{id}")
    public Post updatePost(@PathVariable UUID id, @RequestBody Post updatedPost) {
       return service.update(id, updatedPost.getTitle(), updatedPost.getContent());
    }

    // Supprimer un post existant
    @DeleteMapping("/posts/{id}")
    public void deletePost(@PathVariable UUID id) {
       service.deleteById(id);
    }

    @GetMapping("/posts")
    public List<Post> getAllPostsOrderedByCreationDate() {
       return service.getAll();
    }

    @GetMapping("/posts/category/{categoryId}")
    public List<Post> getPostsByCategory(@PathVariable UUID categoryId) {
        return service.getAllByCategorieId(categoryId);
    }
}
