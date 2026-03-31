package com.agendamentos.agendeja.model.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "categoriaServico")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CategoriaServico {

    @Id                         // PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto-Increment (identificando sequencia de 1 em 1)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(nullable = false, length = 100)
    private String nome_categoria;

    @Column(nullable = true, length = 200)
    private String descricao;

}
