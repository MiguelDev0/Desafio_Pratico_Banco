package com.desafio.banco.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafio.banco.models.transferenciaModel;

@Repository
public interface TransferenciaRepository extends JpaRepository <transferenciaModel, UUID>{
        
}
