package com.samueldevelop;

import com.samueldevelop.servico.MenuBanco;
import com.samueldevelop.simulacao.provisores.MenuTeste;

public class Main {
    public static void main(String[] args) {
        System.out.println("==== Banco Concorrente =======");
        MenuBanco menuTeste = MenuTeste.getManuTeste();

        menuTeste.exibirMenu();
    }
}