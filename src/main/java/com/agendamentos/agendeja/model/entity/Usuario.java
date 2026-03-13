package com.agendamentos.agendeja.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "usuario")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) //Informa que o padrão é uma única tabela para todos os usuários
@DiscriminatorColumn(name = "tipo_usuario", discriminatorType = DiscriminatorType.STRING) // Informa qual é o nome da coluna que vai ser utilizada
@Data
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Usuario {

    @Id                         // PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto-Increment (identificando sequencia de 1 em 1)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(nullable = true, length = 100)
    private String nome;

    @Column(nullable = false, length = 8)
    private String telefone;

    @Column(nullable = true, length = 45)
    private String email;

    @Column(nullable = true, length = 250)
    private String password;

    @Column(nullable = true, length = 100)
    private String endereco;

    @Column(nullable = true, length = 60)
    private String cidade;

    @Column(nullable = true, length = 45)
    private String estado;

    @Column(name = "tipo_usuario", insertable = false, updatable = false)
    private String tipoUsuario;

    private boolean codStatus;

}
