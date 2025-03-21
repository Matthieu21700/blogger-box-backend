package com.dauphine.blogger_box_backend.controllers;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import com.dauphine.blogger_box_backend.model.*;

@RestController
public class PostController {
	@PostMapping("/posts")
    public Post createPost(@RequestBody Post post) {
        return null;
    }

    // Mettre à jour un post existant
    @PutMapping("/posts/{id}")
    public Post updatePost(@PathVariable Long id, @RequestBody Post updatedPost) {
       return null;
    }

    // Supprimer un post existant
    @DeleteMapping("/posts/{id}")
    public void deletePost(@PathVariable Long id) {
        
    }

    @GetMapping("/posts")
    public List<Post> getAllPostsOrderedByCreationDate() {
       return null;
    }

    @GetMapping("/posts/category/{categoryId}")
    public List<Post> getPostsByCategory(@PathVariable Long categoryId) {
        return null;
    }
}
