package com.algaworks.algafood;

import com.algaworks.algafood.notificacao.Notificador;
import com.algaworks.algafood.service.AtivacaoClienteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {
    @Bean
    public AtivacaoClienteService ativacao(Notificador notificador){
        return new AtivacaoClienteService(notificador);
    }
}
