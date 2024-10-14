package com.example.essai21;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Essai {

    @GetMapping("/bonjour")
    public String disBoujour(){
        return "Bonjour";
    }

}
