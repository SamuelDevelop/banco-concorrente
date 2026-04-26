package com.samueldevelop.simulacao.provisores;

import com.samueldevelop.servico.AcaoMenu;
import com.samueldevelop.servico.MenuBanco;
import com.samueldevelop.servico.OpcaoMenu;

public class MenuTeste {
    
    public static MenuBanco getManuTeste(){
        OpcaoMenu[] opcoes = {
            new OpcaoMenu(1, "Escovar os dentes", new AcaoMenu()),
            new OpcaoMenu(2, "Tomar Banho", new AcaoMenu()),
        };

        MenuBanco menubanco = new MenuBanco(2);
        menubanco.setOpcoes(opcoes);

        return menubanco;
    }
}
