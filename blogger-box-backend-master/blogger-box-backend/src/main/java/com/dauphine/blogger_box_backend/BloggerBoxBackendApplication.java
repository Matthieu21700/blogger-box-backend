package com.dauphine.blogger_box_backend;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.swagger.v3.oas.annotations.info.*;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
@SpringBootApplication 

@OpenAPIDefinition(
		info=@Info(
				title="Blogger box backend",
				description ="Blogger box endpoints and apis",
				contact =@Contact (name ="Matthieu",email="matthieu.bussiere21700@gmail.com"),
				version="1.0.0"
				)
		)
public class BloggerBoxBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BloggerBoxBackendApplication.class, args);
	}

}
