package com.sistema_agendamento.agendamento.repository;

import com.sistema_agendamento.agendamento.model.usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UsuarioRepository extends JpaRepository <Usuario, UUID> {
}
