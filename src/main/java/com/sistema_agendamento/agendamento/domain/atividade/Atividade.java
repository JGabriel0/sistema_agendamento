package com.sistema_agendamento.agendamento.domain.atividade;

import com.sistema_agendamento.agendamento.domain.grupo.Grupo;
import com.sistema_agendamento.agendamento.domain.usuario.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Table(name = "atividade")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Atividade {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String titulo;

    private String descricao;

    private LocalDate data;

    private LocalTime hora_inicio;

    private LocalTime hora_fim;

    private String local;

    private OffsetDateTime created_at;

    private OffsetDateTime updated_at;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Prioridade prioridade;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;

    @ManyToOne
    @JoinColumn(name = "grupo_id", nullable = false)
    private Grupo grupo;

    @ManyToOne
    @JoinColumn(name = "created_by", nullable = false)
    private Usuario criadoPor;

    @ManyToMany
    @JoinTable(
            name = "atividade_usuario",
            joinColumns = @JoinColumn(name = "atividade_id"),
            inverseJoinColumns = @JoinColumn(name = "usuario_id")
    )
    private Set<Usuario> responsaveis = new HashSet<>();

}
