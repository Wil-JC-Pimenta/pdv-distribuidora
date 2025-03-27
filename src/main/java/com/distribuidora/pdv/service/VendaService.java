package com.distribuidora.pdv.service;

import com.distribuidora.pdv.model.Venda;
import com.distribuidora.pdv.repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendaService {

    @Autowired
    private VendaRepository vendaRepository;

    public List<Venda> listarVendas() {
        return vendaRepository.findAll();
    }

    public Venda salvarVenda(Venda venda) {
        return vendaRepository.save(venda);
    }
}
