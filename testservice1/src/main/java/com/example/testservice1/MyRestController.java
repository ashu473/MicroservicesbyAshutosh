package com.example.testservice1;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyRestController {

    @GetMapping("/")
    public ResponseEntity<String> Greet(){
        return new ResponseEntity<>("Hello from test service 1", HttpStatus.OK);
    }

    @GetMapping("/fromservice2")
    public ResponseEntity<String> getDataFromService2(){
        RestTemplate restTemplate=new RestTemplate();
        String url="http://localhost:8084/test-service-1";
        ResponseEntity<String> response=restTemplate.getForEntity(url, String.class);
        return response;

    }
}
