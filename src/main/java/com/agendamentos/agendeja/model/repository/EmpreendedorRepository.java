package com.agendamentos.agendeja.model.repository;

import com.agendamentos.agendeja.model.entity.Empreendedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpreendedorRepository extends JpaRepository<Empreendedor, Long> {
}
