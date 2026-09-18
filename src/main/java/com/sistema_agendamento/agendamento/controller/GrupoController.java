package com.sistema_agendamento.agendamento.controller;

import com.sistema_agendamento.agendamento.dto.GrupoCreateRequest;
import com.sistema_agendamento.agendamento.dto.GrupoResponse;
import com.sistema_agendamento.agendamento.dto.GrupoUpdateRequest;
import com.sistema_agendamento.agendamento.service.GrupoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/grupo")
public class GrupoController {

    @Autowired
    private GrupoService grupoService;

    @PostMapping
    public GrupoResponse create(@Valid @RequestBody GrupoCreateRequest req) {
        return grupoService.create(req);
    }

    @PutMapping("/{id}")
    public GrupoResponse update(@PathVariable UUID id, @Valid @RequestBody GrupoUpdateRequest req) {
        return grupoService.update(id, req);
    }

    @GetMapping("/{id}")
    public GrupoResponse getById(@PathVariable UUID id) {
        return grupoService.getById(id);
    }

}
