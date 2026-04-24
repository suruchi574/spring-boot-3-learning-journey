package com.suruchi.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootFirstProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootFirstProjectApplication.class, args);
		//System.out.println("Hello, Suruchi this side");	
		/*Traditional way to create object
		Alien obj = new Alien();
		obj.code();*/
		Alien obj = context.getBean(Alien.class);
		obj.code();
		
		}
	

}
