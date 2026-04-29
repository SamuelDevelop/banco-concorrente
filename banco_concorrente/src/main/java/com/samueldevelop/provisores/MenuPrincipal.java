package com.samueldevelop.provisores;

import com.samueldevelop.abstracts.AbstractMenu;
import com.samueldevelop.servico.AcaoMenu;
import com.samueldevelop.servico.OpcaoMenu;

public class MenuPrincipal extends AbstractMenu{
    public final static OpcaoMenu[] opcoes = {
        new OpcaoMenu(1, "Entrar em uma Conta", new AcaoMenu()), 
        new OpcaoMenu(2, "Gerar chave de ADMIN", new AcaoMenu()),
        new OpcaoMenu(3, "Fechar", new AcaoMenu())
    };

    public final static OpcaoMenu[] opcoesContas = {
        new OpcaoMenu(1, "Realizar Transferência", new AcaoMenu()), 
        new OpcaoMenu(2, "Ver Extrato", new AcaoMenu()),
        new OpcaoMenu(3, "Atualizar Dados", new AcaoMenu())
    };
}
