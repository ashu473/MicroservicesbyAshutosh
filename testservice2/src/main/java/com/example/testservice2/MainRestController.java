package com.example.testservice2;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {
    @GetMapping("/")
    public ResponseEntity<String> Greet(){
        return new ResponseEntity<>("Hello from test service 2", HttpStatus.OK);
    }
}
