package com.csv.Pokedexapi;

import com.csv.Pokedexapi.controller.PokedexClient;
import com.csv.Pokedexapi.models.Berry;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Component;

@EnableFeignClients
@SpringBootApplication
public class PokedexapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokedexapiApplication.class, args);
	}

	@Component
	public class Initializer implements CommandLineRunner {

		private final PokedexClient pokedexClient;

		public Initializer(PokedexClient pokedexClient) {
			this.pokedexClient = pokedexClient;
		}
		@Override
		public void run(String... args) throws Exception {
			Berry berry = this.pokedexClient.searchForBerry("berry");
			System.out.println(berry);
		}
	}

}
