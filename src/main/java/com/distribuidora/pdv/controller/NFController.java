package com.distribuidora.pdv.controller;

import com.distribuidora.service.NFService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/nf")
public class NFController {

    @Autowired
    private NFService nfService;

    @PostMapping("/emitir")
    public ResponseEntity<String> emitirNFe() {
        String resposta = nfService.emitirNFe();
        return ResponseEntity.ok(resposta);
    }
}
