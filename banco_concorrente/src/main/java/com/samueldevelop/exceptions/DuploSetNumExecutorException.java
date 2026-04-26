package com.samueldevelop.exceptions;

public class DuploSetNumExecutorException extends RuntimeException{
    
    public DuploSetNumExecutorException() {
      super("Tentativa de set de um Número Executor para uma opção de menu que já foi setada.");
    }
}
