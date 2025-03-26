package com.distribuidora.pdv.controller;

import com.distribuidora.pdv.dto.PixDTO;
import com.distribuidora.pdv.service.PixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pix")
public class PixController {

    @Autowired
    private PixService pixService;

    @PostMapping("/cobrar")
    public String criarCobranca(@RequestBody PixDTO pixDTO) {
        return pixService.criarCobranca(pixDTO);
    }
}
