package com.algaworks.algafood.jpa.restaurante;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.model.Cozinha;
import com.algaworks.algafood.domain.model.Restaurante;
import com.algaworks.algafood.domain.repository.CozinhaRepository;
import com.algaworks.algafood.domain.repository.RestauranteRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import java.math.BigDecimal;

public class InclusaoRestauranteMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);

		RestauranteRepository restauranteRepository = applicationContext.getBean(RestauranteRepository.class);


		Restaurante restaurante1 = new Restaurante();
		restaurante1.setNome("Restaurante Tô com Fome");
		restaurante1.setTaxaFrete(BigDecimal.valueOf(2.99));
		Restaurante restaurante2 = new Restaurante();
		restaurante2.setNome("Restaurante Tradição");
		restaurante2.setTaxaFrete(BigDecimal.valueOf(11.99));

		restaurante1 = restauranteRepository.adicionar(restaurante1);
		restaurante2 = restauranteRepository.adicionar(restaurante2);

		System.out.printf("O id do restaurante é %d, o nome do restaurante é %s e o frente é %.2f reais\n", restaurante1.getId(), restaurante1.getNome(), restaurante1.getTaxaFrete());
		System.out.printf("O id do restaurante é %d, o nome do restaurante é %s e o frente é %.2f reais\n", restaurante2.getId(), restaurante2.getNome(), restaurante2.getTaxaFrete());
	}
	
}
