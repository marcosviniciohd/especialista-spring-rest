package com.algaworks.algafood.notificacao;

import com.algaworks.algafood.modelo.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
@Profile("prod")
@TipoDoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorEmail implements Notificador {

    @Autowired
    private NotificacaoProperties properties;

    public NotificadorEmail() {
        System.out.println("NotificadorEmail REAL");
    }

    @Override
    public void notificar(Cliente cliente, String mensagem){
        System.out.println("Host: " + properties.getHostServidor());
        System.out.println("Porta: " + properties.getPortaServidor());
        System.out.printf("Notificando %s através do e-mail %s: %s\n", cliente.getNome(), cliente.getEmail(), mensagem);
    }
}
