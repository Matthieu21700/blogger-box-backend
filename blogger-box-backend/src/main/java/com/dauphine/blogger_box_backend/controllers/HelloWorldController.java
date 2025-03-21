package com.dauphine.blogger_box_backend.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {
	
@GetMapping ("/hello-world")
public String helloWorld() {
	return "Hello World";
}

}
