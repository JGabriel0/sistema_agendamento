CREATE INDEX idx_atividade_grupo_data
    ON atividade(grupo_id, data);

CREATE INDEX idx_atividade_grupo_status
    ON atividade(grupo_id, status);

CREATE INDEX idx_atividade_usuario_usuario
    ON atividade_usuario(usuario_id)