package com.distribuidora.pdv.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double total;
    private Date dataVenda;

    // Relacionamentos com produtos, pagamentos, etc.

    // Getters and Setters
}
