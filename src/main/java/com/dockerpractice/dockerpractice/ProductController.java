package com.dockerpractice.dockerpractice;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/product")
@RestController
public class ProductController {
	
	@GetMapping("/status")
	private ResponseEntity<String> getStatus() {
		return new ResponseEntity("success",HttpStatus.OK);

	}

}
