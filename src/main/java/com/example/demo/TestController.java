package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @GetMapping("/clients")
    public List<Client>  getClients(){
        return List.of(
                new Client("Chama","06-09-81","chma@com"),
                new Client("Yassine","06-90-00","yassine@med")
        );
    }

}
