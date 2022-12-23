package com.desafio.banco.services;

import org.springframework.stereotype.Service;

import com.desafio.banco.repositories.TransferenciaRepository;

@Service
public class TransferenciaService {
    
    final TransferenciaRepository transferenciaRepository;

    public TransferenciaService(TransferenciaRepository transferenciaRepository) {
        this.transferenciaRepository = transferenciaRepository;
    }
}
