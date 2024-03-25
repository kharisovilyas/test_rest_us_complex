package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;


@Controller
@RequestMapping("/api/v1")
public class RestController {
    @Autowired ApiService service;
    @GetMapping("/test")
    public ResponseEntity<dtoMessage> testSMAOClient(){
        return ResponseEntity.ok().body(new dtoMessage("TEST", "Тестируем работу RESTful в рамках Комплекс-СГ"));
    }
    @PostMapping("/test_c_api")
    public ResponseEntity<dtoMessage> testCAPI() throws IOException {
        return ResponseEntity.ok().body(service.fetchDataFromCApi());
    }
}
