package com.distribuidora.pdv.model;


import jakarta.persistence.*;

@Entity
public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String metodo;
    private Double valor;

    // Getters and Setters
}
