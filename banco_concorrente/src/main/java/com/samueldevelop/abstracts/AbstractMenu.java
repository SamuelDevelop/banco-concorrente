package com.samueldevelop.abstracts;

import com.samueldevelop.interfaces.Menu;

public abstract class AbstractMenu implements Menu{
    private boolean estaEmExecucao;
    
    public boolean isEmExecucao(){
        return this.estaEmExecucao;
    };

    public void encerrarOperacao(){
        this.estaEmExecucao = false;
    };
}
