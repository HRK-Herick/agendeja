package com.agendamentos.agendeja.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("ADMIN")
public class Admin extends Usuario{

    @Column(nullable = true, length = 20)
    private String nivelAcesso;
}
