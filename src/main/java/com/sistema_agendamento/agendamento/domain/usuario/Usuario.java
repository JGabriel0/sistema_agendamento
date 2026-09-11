package com.sistema_agendamento.agendamento.domain.usuario;

import com.sistema_agendamento.agendamento.domain.atividade.Atividade;
import com.sistema_agendamento.agendamento.domain.grupo.Grupo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Table(name = "usuario")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String nome;

    private String email;

    private String senha;

    private Boolean admin;

    private Boolean ativo;

    private OffsetDateTime created_at;

    private OffsetDateTime updated_at;

    @ManyToOne
    @JoinColumn(name = "grupo_id", nullable = false)
    private Grupo grupo;

    @ManyToMany(mappedBy = "responsaveis")
    private Set<Atividade> atividades = new HashSet<>();

}
