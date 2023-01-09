package com.algaworks.algafood.domain.repository;

import com.algaworks.algafood.domain.model.Estado;
import com.algaworks.algafood.domain.model.Permissao;

import java.util.List;

public interface EstadoRepository {
    List<Estado> todos();
    Estado porId(Long id);
    Estado adicionar(Estado estado);
    void remover(Estado estado);
}
