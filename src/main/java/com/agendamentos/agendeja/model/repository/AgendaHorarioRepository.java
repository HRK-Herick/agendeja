package com.agendamentos.agendeja.model.repository;

import com.agendamentos.agendeja.model.entity.AgendaHorario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgendaHorarioRepository extends JpaRepository<AgendaHorario, Long> {
}
