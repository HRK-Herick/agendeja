package com.agendamentos.agendeja.exceptions;


public class Unauthorized extends RuntimeException {
    public Unauthorized(String message) {
        super(message);
    }
}
