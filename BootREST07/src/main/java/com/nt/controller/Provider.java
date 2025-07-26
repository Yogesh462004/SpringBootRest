package com.nt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.Employee;

@RestController
@RequestMapping("/p")
public class Provider {
	@GetMapping("/pg/{id}/{name}")
	public ResponseEntity<String> get(@PathVariable Integer id,@PathVariable String name){
		return new ResponseEntity<>("Good Morning:"+name,HttpStatus.OK);
	}
	
	@PostMapping("/pp")
	public ResponseEntity<String> actordat(@RequestBody Employee emp){
		 return new ResponseEntity<>(emp.toString(),HttpStatus.OK);
		
	}

}
