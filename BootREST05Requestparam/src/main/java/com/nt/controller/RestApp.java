package com.nt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rp")
public class RestApp {
    @GetMapping("/g") 
   public String show(@RequestParam("no")Integer no,@RequestParam String name) {
	   return no+"----"+name;
   }
    @GetMapping("/r/{cno}/{cname}")
    public String show1(@PathVariable("cno")Integer no,@PathVariable String cname) {
    	return no+"<---->"+cname;
    }


}
