package com.algaworks.algafood.infrastructure.repository;

import com.algaworks.algafood.domain.model.Cozinha;
import com.algaworks.algafood.domain.repository.CozinhaRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class CozinhaRepositoryImpl implements CozinhaRepository {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Cozinha> todas() {
        return manager.createQuery("from Cozinha", Cozinha.class)
                .getResultList();
    }
    @Override
    public Cozinha porId(Long id){
        return manager.find(Cozinha.class, id);
    }

    @Transactional
    @Override
    public Cozinha adicionar(Cozinha cozinha){
        return manager.merge(cozinha);
    }

    @Transactional
    @Override
    public void remover(Cozinha cozinha){
        cozinha = porId(cozinha.getId());
        manager.remove(cozinha);
    }
}
