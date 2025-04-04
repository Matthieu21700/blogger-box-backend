package com.dauphine.blogger_box_backend.controllers;

import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
@RestController
@Tag(
		name="Hello World API",
		description = "My first hello world endpoints")


public class HelloWorldController {
	
@GetMapping ("/hello-world")
public String helloWorld() {
	return "Hello World";
}
@GetMapping("/hello")
public String helloByName(@RequestParam String name) {
	return "hello" +name;
}

@GetMapping("/hello/{name}")
@Operation(
		summary="Hello by name endpoint",
description ="Returns 'Hello{name}'by oath variable"
)
public String hello(@Parameter (description = "Name to greet")
	@PathVariable String name) {
	
	return "hello" +name;
}

}
