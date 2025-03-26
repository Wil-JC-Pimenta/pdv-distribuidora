package com.distribuidora.pdv.service;

import com.distribuidora.pdv.dto.PixDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PixService {

    private final RestTemplate restTemplate;

    @Value("${openpix.api.url}")
    private String openpixApiUrl;

    @Value("${openpix.api.key}")
    private String apiKey;

    public PixService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String criarCobranca(PixDTO pixDTO) {
        // Crie os headers com a chave de API
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "Bearer " + apiKey);

        // Monte o corpo da requisição
        HttpEntity<PixDTO> request = new HttpEntity<>(pixDTO, headers);

        // Faça a chamada POST para criar a cobrança; ajuste o endpoint conforme a documentação do OpenPix
        ResponseEntity<String> response = restTemplate.postForEntity(
                openpixApiUrl + "/v2/cobrancas", request, String.class);

        if (response.getStatusCode() == HttpStatus.CREATED || response.getStatusCode() == HttpStatus.OK) {
            return response.getBody();
        } else {
            // Trate erros conforme necessário
            throw new RuntimeException("Erro ao criar cobrança Pix: " + response.getStatusCode());
        }
    }
}
