package com.sistema_agendamento.agendamento.dto.grupo;

import java.time.OffsetDateTime;
import java.util.UUID;

public record GrupoResponse(
        UUID id,
        String nome,
        OffsetDateTime createdAt,
        OffsetDateTime updatedAt
) {
}
