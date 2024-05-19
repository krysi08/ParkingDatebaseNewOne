package com.example.parkingdatabase;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;

public class CarWebConfig{

    ObjectMapper objectMapper = new ObjectMapper();
    CarWebConfig carWebConfig = new CarWebConfig();

    @Bean
    public WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> enableDefaultServlet() {
        return factory -> factory.setRegisterDefaultServlet(true);
    }

    @Bean
    public CarWebConfig carWebConfig() {
        return carWebConfig;
    }

    @Bean
    public ObjectMapper objectMapper() {
        return objectMapper;
    }
}
