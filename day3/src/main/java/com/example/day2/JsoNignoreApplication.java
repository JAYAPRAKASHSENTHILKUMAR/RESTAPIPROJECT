package com.example.day2;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class JsoNignoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsoNignoreApplication.class, args);
		jsonignore obj=new jsonignore(1,"Jais",21);
				//convert obj into  JSON fromat
				ObjectMapper map= new ObjectMapper();
			    String str = map.writeValueAsString(obj);
			    System.out.println(str);
	}

}
