package com.samueldevelop.dominio.classes;

public class Cliente {
    private int id;
    private String nome;
    private ContaBancaria contasBancarias;

    public Cliente(int id, String nome, ContaBancaria contasBancarias) {
        this.id = id;
        this.nome = nome;
        this.contasBancarias = contasBancarias;
    }

    public int getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public ContaBancaria getContasBancarias() {
        return contasBancarias;
    }
    public void setContasBancarias(ContaBancaria contasBancarias) {
        this.contasBancarias = contasBancarias;
    }    
}
