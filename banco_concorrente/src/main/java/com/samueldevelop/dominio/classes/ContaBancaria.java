package com.samueldevelop.dominio.classes;

import com.samueldevelop.dominio.enums.TipoConta;

public class ContaBancaria {
    private Agencia agencia;
    private TipoConta tipo;
    private double saldo;
    private String status;
    
    public ContaBancaria(Agencia agencia, TipoConta tipo, double saldo, String status) {
        this.agencia = agencia;
        this.tipo = tipo;
        this.saldo = saldo;
        this.status = status;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public TipoConta getTipo() {
        return tipo;
    }

    public void setTipo(TipoConta tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
}
