package com.example.ChiefCode.controllers;

import com.example.ChiefCode.services.FibonacciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FibonacciController {
    @Autowired
    private FibonacciService fibonacciService;

    @GetMapping("/fibonacci")
    public String calculateFibonacci(@RequestParam int memory) {
        return "Fibonacci of " + memory + " is " + fibonacciService.fibonacci(memory);
    }
}
