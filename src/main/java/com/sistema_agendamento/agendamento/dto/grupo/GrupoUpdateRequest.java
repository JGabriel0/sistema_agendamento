package com.sistema_agendamento.agendamento.dto.grupo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record GrupoUpdateRequest(
        @NotBlank @Size(max = 150) String nome
) {
}
