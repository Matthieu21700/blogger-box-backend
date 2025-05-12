package com.dauphine.blogger_box_backend.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="category")
public class Category {

@Id
@Column(name="id")
UUID id;
@Column(name="name")
String name;


public Category() {}

public Category(UUID id,String name) {
	this.id=id;
	this.name = name;
}
public Category(String name) {
	this.id=UUID.randomUUID();
	this.name=name;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public UUID getId() {
	return id;
}

public void setId(UUID id) {
	this.id = id;
}



}
