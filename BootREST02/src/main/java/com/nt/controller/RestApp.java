package com.nt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/crud")
public class RestApp {
     @GetMapping("/c")
	public ResponseEntity<String> show(){
		return new ResponseEntity<String>("Get Mapping",HttpStatus.OK);
	}
     @PostMapping("/r")
 	public ResponseEntity<String> show1(){
 		return new ResponseEntity<String>("Post Mapping",HttpStatus.OK);
 	}
     @PutMapping("/u")
 	public ResponseEntity<String> show2(){
 		return new ResponseEntity<String>("PUT Mapping",HttpStatus.OK);
 	}
     @PatchMapping("/u1")
 	public ResponseEntity<String> show3(){
 		return new ResponseEntity<String>("PATCH Mapping",HttpStatus.OK);
 	}
     @DeleteMapping("/d")
 	public ResponseEntity<String> show4(){
 		return new ResponseEntity<String>("Delete Mapping",HttpStatus.OK);
 	}




}
