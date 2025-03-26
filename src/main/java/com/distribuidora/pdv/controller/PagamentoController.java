package com.distribuidora.pdv.controller;

import com.distribuidora.pdv.model.Pagamento;
import com.distribuidora.pdv.service.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pagamentos")
public class PagamentoController {

    @Autowired
    private PagamentoService pagamentoService;

    @PostMapping
    public Pagamento processarPagamento(@RequestBody Pagamento pagamento) {
        return pagamentoService.processarPagamento(pagamento);
    }
}
