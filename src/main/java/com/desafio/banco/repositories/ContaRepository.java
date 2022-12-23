package com.desafio.banco.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.banco.models.ContaModel;

public interface ContaRepository  extends JpaRepository<ContaModel, UUID>{
    
}
