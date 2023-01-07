package com.algaworks.algafood.jpa.restaurante;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.model.Cozinha;
import com.algaworks.algafood.domain.model.Restaurante;
import com.algaworks.algafood.domain.repository.CozinhaRepository;
import com.algaworks.algafood.domain.repository.RestauranteRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import java.util.List;

public class ExclusaoRestauranteMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);

		RestauranteRepository restauranteRepository = applicationContext.getBean(RestauranteRepository.class);

		Restaurante restaurante = new Restaurante();
		restaurante.setId(1L);
		restauranteRepository.remover(restaurante);

		System.out.println();
		System.out.println("Lista todos os restaurantes depois de excluir o restaurante selecionado");
		System.out.println();
		List<Restaurante> todosRestaurantes = restauranteRepository.todos();
		System.out.println("_________________________________________________________________________");
		for (Restaurante restaurante1 : todosRestaurantes) {
			System.out.println(restaurante1.getNome());
		}
		System.out.println("_________________________________________________________________________");
	}
	
}
