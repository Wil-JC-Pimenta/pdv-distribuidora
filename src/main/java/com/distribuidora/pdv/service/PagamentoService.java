package com.distribuidora.pdv.service;

import com.distribuidora.pdv.model.Pagamento;
import com.distribuidora.pdv.repository.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagamentoService {

    @Autowired
    private PagamentoRepository pagamentoRepository;

    public Pagamento processarPagamento(Pagamento pagamento) {
        return pagamentoRepository.save(pagamento);
    }
}
