package com.algaworks.algafood.controller;

import com.algaworks.algafood.domain.model.Estado;
import com.algaworks.algafood.domain.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/estado")
public class ControllerEstado {

    @Autowired
    private EstadoRepository estadoRepository;

    @GetMapping
    public List<Estado> listar(){
        return estadoRepository.todos();
    }
}
