package com.desafio.banco.models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transferencia")
public class transferenciaModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @Column(nullable = false)
    private Date data_transferencia;
    
    @Column(nullable = false)
    private Double valor;

    @Column(length = 50)
    private String nome_operador_transacao;
    @Id
    private contaModel id_conta;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Date getData_transferencia() {
        return data_transferencia;
    }
    public void setData_transferencia(Date data_transferencia) {
        this.data_transferencia = data_transferencia;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public String getNome_operador_transacao() {
        return nome_operador_transacao;
    }
    public void setNome_operador_transacao(String nome_operador_transacao) {
        this.nome_operador_transacao = nome_operador_transacao;
    }
    public contaModel getId_conta() {
        return id_conta;
    }
    public void setId_conta(contaModel id_conta) {
        this.id_conta = id_conta;
    }

}
