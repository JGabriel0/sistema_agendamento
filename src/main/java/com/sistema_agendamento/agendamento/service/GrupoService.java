package com.sistema_agendamento.agendamento.service;

import com.sistema_agendamento.agendamento.dto.grupo.GrupoCreateRequest;
import com.sistema_agendamento.agendamento.dto.grupo.GrupoResponse;
import com.sistema_agendamento.agendamento.dto.grupo.GrupoUpdateRequest;
import com.sistema_agendamento.agendamento.mapper.GrupoMapper;
import com.sistema_agendamento.agendamento.model.grupo.Grupo;
import com.sistema_agendamento.agendamento.repository.GrupoRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class GrupoService {

    @Autowired
    private GrupoRepository repo;

    @Transactional
    public GrupoResponse create(@Valid GrupoCreateRequest req) {
        Grupo entity = GrupoMapper.toEntity(req);
        entity = repo.save(entity);
        return GrupoMapper.toResponse(entity);
    }

    @Transactional
    public GrupoResponse update(UUID id, @Valid GrupoUpdateRequest req) {
        Grupo entity = repo.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(("Grupo não encontrado!")));
        GrupoMapper.merge(entity, req);
        entity = repo.save(entity);
        return GrupoMapper.toResponse(entity);
    }

    public GrupoResponse getById(UUID id) {
        Grupo entity = repo.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(("Grupo não encontrado!")));
        return GrupoMapper.toResponse(entity);
    }

}
