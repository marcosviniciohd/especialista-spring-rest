package com.algaworks.algafood;

import com.algaworks.algafood.notificacao.NotificadorEmail;
import com.algaworks.algafood.service.AtivacaoClienteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class AlgaConfig {
    @Bean
    public NotificadorEmail notificadorEmail(){
        NotificadorEmail notificador = new NotificadorEmail("smtp.algamail.com.br");
        notificador.setCaixaAlta(true);
        return notificador;
    }
    @Bean
    public AtivacaoClienteService ativacao(){
        return new AtivacaoClienteService(notificadorEmail());
    }
}
