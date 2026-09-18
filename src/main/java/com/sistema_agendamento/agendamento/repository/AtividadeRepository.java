package com.sistema_agendamento.agendamento.repository;

import com.sistema_agendamento.agendamento.model.atividade.Atividade;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AtividadeRepository extends JpaRepository<Atividade, UUID> {
}
