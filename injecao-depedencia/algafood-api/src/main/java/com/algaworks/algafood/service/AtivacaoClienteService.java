package com.algaworks.algafood.service;

import com.algaworks.algafood.modelo.Cliente;
import com.algaworks.algafood.notificacao.NotificadorEmail;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

    private NotificadorEmail notificadorEmail;

    public void ativar(Cliente cliente){
        cliente.ativar();
        notificadorEmail.notificar(cliente, "Seu cadastro no sistema está ativo!");

    }
}
