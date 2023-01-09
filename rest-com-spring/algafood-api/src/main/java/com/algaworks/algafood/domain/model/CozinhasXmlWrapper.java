package com.algaworks.algafood.domain.model;

import lombok.Data;
import lombok.NonNull;

import java.util.List;

@Data
public class CozinhasXmlWrapper {
    @NonNull
    private List<Cozinha> cozinhas;

}
