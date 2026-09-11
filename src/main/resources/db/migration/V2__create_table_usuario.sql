CREATE TABLE usuario (
    id UUID PRIMARY KEY,
    grupo_id UUID NOT NULL,
    nome VARCHAR(150) NOT NULL,
    email VARCHAR(255) NOT NULL,
    senha VARCHAR(255) NOT NULL,
    admin BOOLEAN NOT NULL DEFAULT FALSE,
    ativo BOOLEAN NOT NULL DEFAULT TRUE,
    created_at TIMESTAMPTZ NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMPTZ NOT NULL DEFAULT CURRENT_TIMESTAMP,

    CONSTRAINT fk_usuario_grupo
        FOREIGN KEY (grupo_id)
            REFERENCES grupo(id),

    CONSTRAINT uq_usuario_email
        UNIQUE (email)
);