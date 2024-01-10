package com.generation.atividade1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atividade1")
public class Atividade1Controller {

    @GetMapping("/helloWorld")
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping("/bsm")
    public String bsm() {
        return "Persistência\r\n" + "Mentalidade de crescimento\r\n" + "Responsabilidade pessoal\r\n"
                + "Orientação ao futuro\r\n" + "Orientação ao detalhe\r\n" + "Trabalho em equipe\r\n"
                + "Comunicação\r\n" + "Proatividade";
    }

    @GetMapping("/objetivos")
    public String objetivos() {
        return "1. Entender melhor como usar o Spring.\n" + "2. Entender melhor os conceitos de REST e API's";
    }
}