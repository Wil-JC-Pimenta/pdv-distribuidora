package com.distribuidora.pdv.config;

import br.com.openpix.sdk.WooviSDK;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenPixConfig {

    @Value("${openpix.app.id}")
    private String appId;

    @Bean
    public WooviSDK wooviSDK() {
        return new WooviSDK(appId);
    }
}
