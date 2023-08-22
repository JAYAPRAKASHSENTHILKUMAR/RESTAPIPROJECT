package com.example.day2.demo.jsonignore;

import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class jsonignore {
       public int studentId;
       public String studentName;
       @JsonIgnore
       public int agee;
	public jsonignore(int studentId, String studentName, int agee) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.agee = agee;
		ObjectMapper map=new ObjectMapping();
		String str=map.writeValueAsString(obj);
		System.out.println(str);
		
		
	}
       
       
}
