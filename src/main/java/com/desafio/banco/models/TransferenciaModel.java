package com.desafio.banco.models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "transferencia")
public class TransferenciaModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @Column(nullable = false)
    private Date data_transferencia;
    
    @Column(nullable = false)
    private Double valor;

    @Column(nullable = false, length = 15)
    private String tipo;

    @Column(length = 50)
    private String nome_operador_transacao;
    @ManyToOne
    @JoinColumn(name = "id_conta")
    private ContaModel contaModel;
    
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
    public ContaModel getId_conta() {
        return contaModel;
    }
    public void setId_conta(ContaModel id_conta) {
        contaModel = id_conta;
    }

}
