package com.samueldevelop.dominio.classes;

public class Agencia {
    private String numero;
    private byte dv;
    
    public Agencia(String numero, byte dv) {
        this.numero = numero;
        this.dv = dv;
    }

    public String getNumero() {
        return numero;
    }

    public byte getDv() {
        return dv;
    }
}
