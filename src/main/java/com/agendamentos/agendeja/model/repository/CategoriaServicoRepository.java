package com.agendamentos.agendeja.model.repository;

import com.agendamentos.agendeja.model.entity.CategoriaServico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaServicoRepository extends JpaRepository<CategoriaServico, Long> {
}
