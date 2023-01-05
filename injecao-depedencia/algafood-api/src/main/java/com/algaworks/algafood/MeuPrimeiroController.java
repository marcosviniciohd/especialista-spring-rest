package com.algaworks.algafood;

import com.algaworks.algafood.modelo.Cliente;
import com.algaworks.algafood.service.AtivacaoClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MeuPrimeiroController {

    private AtivacaoClienteService ativacaoClienteService;

    public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
        this.ativacaoClienteService = ativacaoClienteService;
        System.out.println("MeuPrimeiroController: " + ativacaoClienteService);
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        Cliente cliente = new Cliente("Marcos Vinício", "marcosviniciohd@hotmail.com", "349225599");
        ativacaoClienteService.ativar(cliente);
        return "<html>" +
                "<h1>" + cliente.getNome() + "</h1>" +
                "<h2>" + cliente.getTelefone() + "</h2>" +
                "</html>";
    }
}
