package com.vicksanchez.screenmatch_frases.controllers;

import com.vicksanchez.screenmatch_frases.dto.FraseDTO;
import com.vicksanchez.screenmatch_frases.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/series")
public class FraseController {

    @Autowired
    FraseService servicio;

    @GetMapping("/frases")
    public FraseDTO obtenerFraseAleatoria(){
        return servicio.obtenerFraseAleatoria();
    }
}
