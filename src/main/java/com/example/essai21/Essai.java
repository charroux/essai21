package com.example.essai21;

import org.springframework.web.bind.annotation.*;

@RestController
public class Essai {

    @GetMapping("/bonjour")
    public String disBoujour(){
        return "Bonjour";
    }

    @GetMapping("/car")
    public Car getCar(){
        return new Car("Ferrari", 1000);
    }

    @PutMapping(value = "/voiture/{plateNumber}")
    public void rentOrGetBack(
            @PathVariable("plateNumber") String plateNumber,
            @RequestParam(value="rent", required = false)boolean rent) throws Exception{
        System.out.println(plateNumber);
    }

}
