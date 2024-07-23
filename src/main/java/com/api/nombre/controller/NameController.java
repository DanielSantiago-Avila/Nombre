package com.api.nombre.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hola")
public class NameController {

    @GetMapping("/{nombre}")
    public String sayHello(@PathVariable String nombre) {
        return "Hola, " + nombre + "!";
    }
}
