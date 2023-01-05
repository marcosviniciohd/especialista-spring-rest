package com.algaworks.algafood.service;

import com.algaworks.algafood.modelo.Cliente;
import com.algaworks.algafood.notificacao.Notificador;
import com.algaworks.algafood.notificacao.NotificadorEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

    @Autowired
    private Notificador notificador;


    /*public AtivacaoClienteService(Notificador notificador) {
        this.notificador = notificador;
    }*/

    /*public AtivacaoClienteService(String qualquer){

    }*/

    public void ativar(Cliente cliente){
        cliente.ativar();
        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");

    }

    /*@Autowired
    public void setNotificador(Notificador notificador) {
        this.notificador = notificador;
    }*/
}
