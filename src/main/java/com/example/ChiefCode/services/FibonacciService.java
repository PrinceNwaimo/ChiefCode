package com.example.ChiefCode.services;

import org.springframework.stereotype.Service;

@Service
public class FibonacciService {
    public long fibonacci(int memory) {
        if (memory <= 1) {
            return memory;
        } else {
            return fibonacci(memory - 1) + fibonacci(memory - 2);
        }
    }
}
