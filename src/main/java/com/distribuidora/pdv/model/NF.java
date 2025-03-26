package com.distribuidora.pdv.model;

import jakarta.persistence.*;

@Entity
public class NF {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String chaveAcesso;
    @Column(length = 5000)
    private String xml;

    // Getters and Setters
}
