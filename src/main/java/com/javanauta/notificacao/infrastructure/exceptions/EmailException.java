package com.javanauta.notificacao.infrastructure.exceptions;

import com.javanauta.notificacao.business.EmailService;

public class EmailException extends RuntimeException{

    public EmailException(String mensangem){
        super(mensangem);
    }

    public EmailException(String mensagem, Throwable throwable){
        super(mensagem, throwable);
    }
}
