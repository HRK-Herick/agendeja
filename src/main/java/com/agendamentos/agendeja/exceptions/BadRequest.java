package com.agendamentos.agendeja.exceptions;


public class BadRequest extends RuntimeException {

    public BadRequest(String message) {
        super(message);
    }
}
