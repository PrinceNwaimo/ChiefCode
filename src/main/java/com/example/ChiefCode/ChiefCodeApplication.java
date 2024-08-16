package com.example.ChiefCode;

import com.example.ChiefCode.services.FibonacciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChiefCodeApplication implements CommandLineRunner {
	@Autowired
	private FibonacciService fibonacciService;
	public static void main(String[] args) {
		SpringApplication.run(ChiefCodeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		int memory = 40; 
		while (true) {
			System.out.println("Fibonacci of " + memory + " is " + fibonacciService.fibonacci(memory));
			memory++; 
		}
	}
}

