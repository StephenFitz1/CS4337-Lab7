package com.example.demo.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface IExternalService {
    public ResponseEntity<String> requestLoremIpsum();
}
