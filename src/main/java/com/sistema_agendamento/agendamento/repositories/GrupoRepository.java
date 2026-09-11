package com.sistema_agendamento.agendamento.repositories;

import com.sistema_agendamento.agendamento.domain.grupo.Grupo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface GrupoRepository extends JpaRepository<Grupo, UUID> {
}
