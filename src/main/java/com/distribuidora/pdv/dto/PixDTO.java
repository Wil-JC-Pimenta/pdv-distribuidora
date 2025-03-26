package com.distribuidora.pdv.dto;

public class PixDTO {
    private Double valor;
    private String descricao;

    // Construtores, getters e setters

    public PixDTO() {}

    public PixDTO(Double valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
