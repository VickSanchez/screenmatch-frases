package com.vicksanchez.screenmatch_frases.service;

import com.vicksanchez.screenmatch_frases.dto.FraseDTO;
import com.vicksanchez.screenmatch_frases.models.Frase;
import com.vicksanchez.screenmatch_frases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
    FraseRepository repository;

    public FraseDTO obtenerFraseAleatoria() {
        Frase frase =  repository.obtenerFraseAleatoria();

        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonaje(), frase.getPoster());


    }
}
