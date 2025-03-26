-- Script inicial para criação de tabelas
CREATE TABLE produto (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(255),
    preco DOUBLE,
    estoque INT
);

CREATE TABLE venda (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    total DOUBLE,
    data_venda TIMESTAMP
);

-- Crie outras tabelas conforme necessário
