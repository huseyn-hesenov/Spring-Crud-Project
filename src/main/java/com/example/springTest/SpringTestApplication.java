package com.example.springTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTestApplication.class, args);

		StudentTable gt=new StudentTable();
		gt.setFirstname("huseyn");
		gt.setLastname("hesenov");
		gt.setId(23L);
		gt.setAge(20);
		gt.setMail("hesenovhuseyn666@gmsil.com");








	}

}
