package com.desafio.banco.dtos;

import java.util.Date;

public class TransferenciaDto {
    
    private Date dataInicio;
    private Date dataFim;
    private String nomeOperador;
    
    public Date getDataInicio() {
        return dataInicio;
    }
    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }
    public Date getDataFim() {
        return dataFim;
    }
    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }
    public String getNomeOperador() {
        return nomeOperador;
    }
    public void setNomeOperador(String nomeOperador) {
        this.nomeOperador = nomeOperador;
    }
    
}
