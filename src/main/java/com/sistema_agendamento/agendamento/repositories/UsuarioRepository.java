package com.sistema_agendamento.agendamento.repositories;

import com.sistema_agendamento.agendamento.domain.usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UsuarioRepository extends JpaRepository <Usuario, UUID> {
}
