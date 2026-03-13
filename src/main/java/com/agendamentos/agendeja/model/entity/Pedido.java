package com.agendamentos.agendeja.model.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import java.time.LocalDateTime;

@Entity
@Table (name = "pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(nullable = true, length = 100)
    private double valorPedido;

    @Column(nullable = true)
    private LocalDateTime dataHoraPedido;

    @Column(nullable = false)
    private LocalDateTime dataHoraEntrega;

    @Column(nullable = true, length = 50)
    private String status;

    private boolean codStatus;

}
