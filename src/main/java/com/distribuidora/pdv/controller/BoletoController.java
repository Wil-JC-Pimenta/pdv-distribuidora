package com.distribuidora.pdv.controller;



import com.distribuidora.pdv.service.BoletoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/boletos")
public class BoletoController {

    @Autowired
    private BoletoService boletoService;

    @PostMapping("/emitir")
    public ResponseEntity<String> emitirBoleto() {
        String resposta = boletoService.gerarBoleto();
        return ResponseEntity.ok(resposta);
    }
}
