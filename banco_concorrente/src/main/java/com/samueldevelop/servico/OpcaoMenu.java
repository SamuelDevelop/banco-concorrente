package com.samueldevelop.servico;

import com.samueldevelop.exceptions.DadoIndefinidoException;
import com.samueldevelop.exceptions.DuploSetNumExecutorException;

public class OpcaoMenu {
    private Integer numeroExecutor;
    private Boolean isSetNumeroExecutor;
    private String mensagem;
    private AcaoMenu acao;
  
    public OpcaoMenu() {
        this.numeroExecutor = null;
        this.isSetNumeroExecutor = false;
        this.mensagem = null;
        this.acao = null;
    }

    public OpcaoMenu(int numeroExecutor, String mensagem, AcaoMenu acao) {
        this.numeroExecutor = numeroExecutor;
        this.isSetNumeroExecutor = true;
        this.mensagem = mensagem;
        this.acao = acao;
    }

    public void setNumeroExecutor(int numeroExecutor){
        if(!isSetNumeroExecutor){
            this.numeroExecutor = numeroExecutor;
            this.isSetNumeroExecutor = true;
        }
        else{
            throw new DuploSetNumExecutorException();
        }
    }
    public int getNumeroExecutor(){
        return this.numeroExecutor;
    }

    public String getMensagem() {
        return mensagem;
    }
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public AcaoMenu getAcao() {
        return acao;
    }
    public void setAcao(AcaoMenu acao) {
        this.acao = acao;
    }
    public void executeAcao() {
        this.acao.executar();
    }

    public String toString(){
        if(this.numeroExecutor == null || !this.isSetNumeroExecutor || this.mensagem == null || this.acao == null){
            throw new DadoIndefinidoException("/servico/OpcaoMenu.java", "Numero Executor ou Mensagem ou Ação");
        }

        String string = numeroExecutor + " - " + mensagem + ";";
        
        return string;
    }
}
