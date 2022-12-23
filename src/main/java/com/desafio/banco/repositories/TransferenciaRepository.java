package com.desafio.banco.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.banco.models.TransferenciaModel;

public interface TransferenciaRepository extends JpaRepository <TransferenciaModel, UUID>{
        
}
