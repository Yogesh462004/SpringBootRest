package com.nt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.nt.model.Employee;

@SpringBootApplication
public class BootRest08Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BootRest08Application.class, args);
	}
	
	@Autowired
	private WebClient webClient;
	@Override
	public void run(String... args) throws Exception {
		
		  String url="http://localhost:407/p/pg/{id}/{name}"; 
		  RestTemplate t=new
		  RestTemplate(); ResponseEntity<String> res=t.getForEntity(url,
		  String.class,1001,"raju"); System.out.println(res.getBody());
		  System.out.println(res.getStatusCodeValue());
		  
		 
		Employee user =new Employee();
		user.setName("Yogesh");
		user.setId(10);
		
		ResponseEntity<String> responseEntity = webClient.post()
		        .uri("/p/pp") // Adjust endpoint as needed
		        .bodyValue(user)
		        .retrieve()
		        .toEntity(String.class)
		        .block(); // Synchronous

		    if (responseEntity != null) {
		        System.out.println("Status Code: " + responseEntity.getStatusCode());
		        System.out.println("Response Body: " + responseEntity.getBody());
		    }
		    
		}
}
