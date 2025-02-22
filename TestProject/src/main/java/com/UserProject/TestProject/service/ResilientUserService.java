package com.UserProject.TestProject.service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ResilientUserService {
    private final RestTemplate restTemplate = new RestTemplate();
    private static final String USER_API = "https://dummyjson.com/users";

    @CircuitBreaker(name = "userService", fallbackMethod = "fallbackUsers")
    @Retry(name = "userService", fallbackMethod = "fallbackUsers")
    public ResponseEntity<String> fetchUsers() {
        return restTemplate.getForEntity(USER_API, String.class);
    }

    public ResponseEntity<String> fallbackUsers(Exception e) {
        return ResponseEntity.status(503).body("Fallback: External API not available");
    }
}
