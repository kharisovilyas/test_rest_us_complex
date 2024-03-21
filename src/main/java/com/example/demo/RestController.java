package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/api/v1")
public class RestController {
    @GetMapping("/test")
    public ResponseEntity<dtoMessage> testSMAOClient(){
        return ResponseEntity.ok().body(new dtoMessage("TEST", "Тестируем работу RESTful в рамках Комплекс-СГ"));
    }
}
