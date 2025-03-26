package com.distribuidora.pdv.controller;


import com.distribuidora.model.Venda;
import com.distribuidora.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendas")
public class VendaController {

    @Autowired
    private VendaService vendaService;

    @GetMapping
    public List<Venda> listarVendas() {
        return vendaService.listarVendas();
    }

    @PostMapping
    public Venda criarVenda(@RequestBody Venda venda) {
        return vendaService.salvarVenda(venda);
    }
}
