package com.dauphine.blogger_box_backend.model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Category {
String name;
@Id
UUID id;

public Category(String name) {

	this.name = name;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}


}
