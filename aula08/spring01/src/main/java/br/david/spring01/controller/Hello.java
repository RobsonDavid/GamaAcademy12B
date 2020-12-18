package br.david.spring01.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// anotação = 
@RestController // classe controller do tipo Rest
@CrossOrigin("*") // aceita pedidos de qualquer origem (poderia ser de um domínio específico)
@RequestMapping("/start") // padrão de requisição para esta classe
public class Hello {

    // atributos

    // métodos

    @GetMapping("hello")  // método GET com uri 'hello'
    public String hello(){
        return "Hello world by REDUARD :-)";
    }
}
