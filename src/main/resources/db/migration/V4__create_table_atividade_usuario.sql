CREATE TABLE atividade_usuario (
    atividade_id UUID NOT NULL,
    usuario_id UUID NOT NULL,

    PRIMARY KEY (atividade_id, usuario_id),

    CONSTRAINT fk_atividade_usuario_atividade
        FOREIGN KEY (atividade_id)
            REFERENCES atividade(id)
            ON DELETE CASCADE,

    CONSTRAINT fk_atividade_usuario_usuario
        FOREIGN KEY (usuario_id)
            REFERENCES usuario(id)
            ON DELETE CASCADE
);