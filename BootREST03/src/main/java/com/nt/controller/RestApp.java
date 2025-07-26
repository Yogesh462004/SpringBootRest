package com.nt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Employee;

@RestController
@RequestMapping("/messageapi")
public class RestApp {
     @GetMapping("/wish")
	public ResponseEntity<Employee> show(){
		return new ResponseEntity<Employee>(new Employee(1,"Yogesh",50.5),HttpStatus.OK);
	}
}
