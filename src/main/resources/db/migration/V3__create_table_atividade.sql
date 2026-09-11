CREATE TABLE atividade (
    id UUID PRIMARY KEY,
    grupo_id UUID NOT NULL,
    titulo VARCHAR(200) NOT NULL,
    descricao TEXT,
    data DATE NOT NULL,
    hora_inicio TIME,
    hora_fim TIME,
    local VARCHAR(255),
    prioridade VARCHAR(20) NOT NULL DEFAULT 'NORMAL',
    status VARCHAR(20) NOT NULL DEFAULT 'AGENDADA',
    created_by UUID NOT NULL,
    created_at TIMESTAMPTZ NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMPTZ NOT NULL DEFAULT CURRENT_TIMESTAMP,

    CONSTRAINT fk_atividade_grupo
        FOREIGN KEY (grupo_id)
            REFERENCES grupo(id),

    CONSTRAINT fk_atividade_criador
        FOREIGN KEY (created_by)
            REFERENCES usuario(id),

    CONSTRAINT ck_atividade_prioridade
        CHECK (
            prioridade IN (
                'BAIXA',
                'NORMAL',
                'ALTA',
                'URGENTE'
            )
        ),

    CONSTRAINT ck_atividade_status
        CHECK (
            status IN (
                'AGENDADA',
                'EM_ANDAMENTO',
                'CONCLUIDA',
                'CANCELADA'
            )
        ),

    CONSTRAINT ck_atividade_horario
        CHECK (
            hora_fim IS NULL
            OR hora_inicio IS NULL
            OR hora_fim > hora_inicio
        )
);