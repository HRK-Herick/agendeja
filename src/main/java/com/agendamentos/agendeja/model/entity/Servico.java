package com.agendamentos.agendeja.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalTime;

@Entity
@Table(name = "servico")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Servico {

    @Id                         // PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto-Increment (identificando sequencia de 1 em 1)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(nullable = false, length = 50)
    private String nomeServico;

    @Column(nullable = true, length = 200)
    private String descricao;


    @Column(nullable = false, precision = 10, scale = 2 )
    private BigDecimal preco;

    @Column(nullable = true)
    private LocalTime tempo_medio;


    @ManyToOne
    @JoinColumn(name = "empreendedor_id", referencedColumnName = "id", nullable = false)
    private Empreendedor empreendedor;

    @ManyToOne
    @JoinColumn(name = "categoria_id", referencedColumnName = "id", nullable = false)
    private CategoriaServico categoria;


}
