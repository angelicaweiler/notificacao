package com.javanauta.notificacao.infrastructure.exceptions;

public class EmailException extends RuntimeException{

    public EmailException(String mensagem, Throwable throwable){
        super(mensagem, throwable);
    }
}
