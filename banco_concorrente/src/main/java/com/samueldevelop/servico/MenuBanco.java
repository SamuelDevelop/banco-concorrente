package com.samueldevelop.servico;

public class MenuBanco {
    private int numeroOpcoes;
    private OpcaoMenu[] opcoes;
    
    public MenuBanco(int numeroOpcoes) {
        this.numeroOpcoes = numeroOpcoes;
    }

    public void exibirMenu(){
        for (OpcaoMenu opcaoMenu : opcoes) {
            System.out.println(opcaoMenu.toString());
        }
    }

    public int getNumeroOpcoes() {
        return numeroOpcoes;
    }
    public void setNumeroOpcoes(int numeroOpcoes) {
        this.numeroOpcoes = numeroOpcoes;
    }

    public OpcaoMenu[] getOpcoes() {
        return opcoes;
    }
    public void setOpcoes(OpcaoMenu[] opcoes) {
        this.opcoes = opcoes;
    }
}
