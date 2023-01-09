package com.algaworks.algafood.domain.repository;

import com.algaworks.algafood.domain.model.Cidade;
import com.algaworks.algafood.domain.model.Estado;

import java.util.List;

public interface CidadeRepository {
    List<Cidade> todos();
    Cidade porId(Long id);
    Cidade adicionar(Cidade Cidade);
    void remover(Cidade Cidade);
}
