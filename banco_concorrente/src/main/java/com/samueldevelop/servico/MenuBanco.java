package com.samueldevelop.servico;

import com.samueldevelop.interfaces.Menu;

public class MenuBanco implements Menu{
    private int numeroOpcoes;
    private OpcaoMenu[] opcoes;
    private boolean estaEmExecucao;
    
    public MenuBanco(int numeroOpcoes) {
        this.numeroOpcoes = numeroOpcoes;
        this.estaEmExecucao = false;
    }

    public void exibirMenu(){
        for (OpcaoMenu opcaoMenu : opcoes) {
            System.out.println(opcaoMenu.toString());
            this.estaEmExecucao = true;
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

    public boolean isEmExecucao(){
        return this.estaEmExecucao;
    }
    public void encerrarOperacao(){
        this.estaEmExecucao = false;
    }
}
