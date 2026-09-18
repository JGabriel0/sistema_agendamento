package com.sistema_agendamento.agendamento.mapper;

import com.sistema_agendamento.agendamento.dto.GrupoCreateRequest;
import com.sistema_agendamento.agendamento.dto.GrupoResponse;
import com.sistema_agendamento.agendamento.dto.GrupoUpdateRequest;
import com.sistema_agendamento.agendamento.model.grupo.Grupo;

public class GrupoMapper {

    public static Grupo toEntity(GrupoCreateRequest req) {
        return Grupo.builder()
                .nome(req.nome())
                .build();
    }

    public static GrupoResponse toResponse(Grupo res) {
        return new GrupoResponse(
                res.getId(),
                res.getNome(),
                res.getCreatedAt(),
                res.getUpdatedAt()
        );
    }

    public static void merge(Grupo entity, GrupoUpdateRequest req) {
        if (req.nome() != null) {
            entity.setNome(req.nome());
        }
    }

}
