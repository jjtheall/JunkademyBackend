package com.csc492;

import java.util.HashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JunkademyApplication {

	public static void main(String[] args) {
		SpringApplication.run(JunkademyApplication.class, args);
	}
	
	@GetMapping("/")
	public ResponseEntity<Object> root() {
		return new ResponseEntity<>(new HashMap<>(), HttpStatus.OK);
	  }

	
	@GetMapping("/home")
	public ResponseEntity<Object> home() {
		return new ResponseEntity<>(new HashMap<>(), HttpStatus.OK);
	  }


}
