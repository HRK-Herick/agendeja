package com.agendamentos.agendeja.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode(callSuper = true)
@Entity
@DiscriminatorValue("EMPREENDEDOR")
@Getter
@Setter
public class Empreendedor extends Usuario{

    @Column(nullable = true, length = 250)
    private String areaAtuacao;

    @Column(nullable = true, length = 14)
    private String cnpj;

}
