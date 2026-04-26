package com.samueldevelop.exceptions;

public class DadoIndefinidoException extends RuntimeException{
    public DadoIndefinidoException(){
        super("Um dado está indefinido");
    }

    public DadoIndefinidoException(String local, String dadosindefinidos){
        super("Foram encontrados dados indefinidos:" + dadosindefinidos + "Em:" + local);        
    }
}
