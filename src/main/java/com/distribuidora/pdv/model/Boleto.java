package com.distribuidora.pdv.model;

import jakarta.persistence.*;

@Entity
public class Boleto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigoBarras;
    private Double valor;

    // Getters and Setters
}
