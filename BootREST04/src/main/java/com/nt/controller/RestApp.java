package com.nt.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Employee;

@RestController
@RequestMapping("/emp")
public class RestApp {
	@PostMapping("/report")
     public String report1(@RequestBody Employee emp) {
    	 return emp.toString()+"hello";
     }
}
