package com.example.lab1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lab1Application implements CommandLineRunner {
	@Override
	public void run(String args[]) throws Exception
	{

		System.out.println("HEllo world");
	}

	public static void main(String[] args)
	{
		SpringApplication.run(
				Lab1Application.class, args);
	}

}

