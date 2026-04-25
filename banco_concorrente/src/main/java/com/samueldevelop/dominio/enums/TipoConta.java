package com.samueldevelop.dominio.enums;

public enum TipoConta {
    CORRENTE("corrente"),
    POUPANÇA("poupança");

    private String tipo;

    TipoConta(String tipo){
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
