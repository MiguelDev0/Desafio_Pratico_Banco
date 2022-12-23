package com.desafio.banco.services;

import org.springframework.stereotype.Service;

import com.desafio.banco.repositories.ContaRepository;

@Service
public class contaService {
    
    final ContaRepository contaRepository;

    public contaService(ContaRepository contaRepository) {
        this.contaRepository = contaRepository;
    }

}
