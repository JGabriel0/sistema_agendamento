package com.sistema_agendamento.agendamento.repository;

import com.sistema_agendamento.agendamento.model.grupo.Grupo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface GrupoRepository extends JpaRepository<Grupo, UUID> {
}
