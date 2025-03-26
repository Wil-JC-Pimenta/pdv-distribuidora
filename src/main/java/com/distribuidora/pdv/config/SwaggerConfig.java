package com.distribuidora.pdv.config;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI apiInfo() {
        return new OpenAPI()
                .info(new Info()
                        .title("PDV Bebidas API")
                        .description("API para gerenciamento de vendas, produtos, pagamentos, NF-e, boletos e Pix")
                        .version("1.0.0"));
    }
}
