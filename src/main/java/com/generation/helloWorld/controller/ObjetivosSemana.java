package com.generation.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivo")
public class ObjetivosSemana {

    @GetMapping
    public String objetivoSemanal() {
        return "PONTOS A MELHORAR\n" +
                "\n" +
                "COMUNICAÇÃO\n" +
                "TÉCNICA\n" +
                "PROATIVIDADE\n" +
                "LIDERANÇA";
    }
}
