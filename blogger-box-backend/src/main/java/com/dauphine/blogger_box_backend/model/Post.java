package com.dauphine.blogger_box_backend.model;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="post")
public class Post {
	
	@Id
	@Column(name="id")
	private UUID id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="content")
	private String content;
	
	@Column(name="created_date")
	private LocalDateTime createdDate;
	
	@ManyToOne
	@JoinColumn(name="category_id")
	private Category category;
	
	public Post() {
		
	}
	public Post(String title, String content,Category category) {
		this.id=UUID.randomUUID();
		this.title=title;
		this.content=content;
		this.category=category;
		this.createdDate=LocalDateTime.now();
		
	}
}
