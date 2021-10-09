package com.jwt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jwt.model.User;
import com.jwt.repo.UserRepository;

@SpringBootApplication
public class JwtAuthenticationServerProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtAuthenticationServerProjectApplication.class, args);

	}

}
