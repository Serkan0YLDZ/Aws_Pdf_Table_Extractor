package com.example.aws_pdf_table_extractor.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class HealthController {

    @GetMapping("/health")
    public Map<String, Object> health() {
        Map<String, Object> response = new HashMap<>();
        response.put("status", "UP");
        response.put("timestamp", LocalDateTime.now());
        response.put("message", "AWS PDF Table Extractor is running successfully!");
        response.put("version", "0.0.1-SNAPSHOT");
        return response;
    }

    @GetMapping("/info")
    public Map<String, Object> info() {
        Map<String, Object> response = new HashMap<>();
        response.put("appName", "AWS PDF Table Extractor");
        response.put("description", "Spring Boot application for extracting tables from PDF files using AWS services");
        response.put("javaVersion", System.getProperty("java.version"));
        response.put("springBootVersion", "3.5.3");
        return response;
    }

    @GetMapping("/test")
    public Map<String, String> test() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello from AWS PDF Table Extractor!");
        response.put("endpoint", "/api/test");
        response.put("method", "GET");
        return response;
    }
}
