package com.dauphine.blogger_box_backend.repositories;
import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dauphine.blogger_box_backend.model.Post;

public interface PostRepository extends JpaRepository< Post,UUID> {
    List<Post> findByCategory_id(UUID category_id);
    List<Post> findAllByOrderByCreatedDateDesc();
}
