package com.nt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messageapi")
public class RestApp {
     @GetMapping("/wish")
	public ResponseEntity<String> show(){
		return new ResponseEntity<String>("GoodMorning",HttpStatus.OK);
	}
}
