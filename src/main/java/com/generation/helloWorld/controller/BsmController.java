package com.generation.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/BSM's")
public class BsmController {

    @GetMapping
    public String bsmGeneration() {
        return "HABILIDADES\n" +
                "\n" +
                "TRABALHO EM EQUIPE\n" +
                "ORIENTAÇÃO AO DETALHE\n" +
                "PROATIVIDADE\n" +
                "COMUNICAÇÃO\n" +
                "\n" +
                "\n" +
                "MENTALIDADES\n" +
                "\n" +
                "ORIENTAÇÃO AO FUTURO\n" +
                "RESPONSABILIDADE PESSOAL\n" +
                "MENTALIDADE DE CRESCIMENTO\n" +
                "PERSISTÊNCIA";
    }
}
