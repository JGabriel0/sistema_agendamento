package com.sistema_agendamento.agendamento.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record GrupoCreateRequest(
        @NotBlank @Size(max = 150) String nome
) {
}
