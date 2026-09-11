package com.sistema_agendamento.agendamento.repositories;

import com.sistema_agendamento.agendamento.domain.atividade.Atividade;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AtividadeRepository extends JpaRepository<Atividade, UUID> {
}
