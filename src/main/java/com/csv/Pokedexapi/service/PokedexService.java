package com.csv.Pokedexapi.service;

import com.csv.Pokedexapi.DTO.BerriesDTO;
import com.csv.Pokedexapi.models.BerryModels.Berry;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Objects;

@Service
public class PokedexService {

    @Value("${pokedexAPI.basePath}")
    private String pokedexAPIbasePath;
    @Value("${pokedexAPI.version}")
    private String pokedexAPIversion;
    @Value("${pokedexAPI.resource}")
    private String pokedexAPIresource;

//    public List<Berry> getBerries() {
//        String url = "https://pokeapi.co/api/v2/berry";
//        RestTemplate restTemplate = new RestTemplate();
//        List<Berry> berries = Objects.requireNonNull(restTemplate.getForObject(url, BerriesDTO.class)).getResults();
//
//        return berries;
//    }

    public List<Berry> getBerries() {
        String url = pokedexAPIbasePath + pokedexAPIversion + pokedexAPIresource;
        RestTemplate restTemplate = new RestTemplate();
        List<Berry> berries = Objects.requireNonNull(restTemplate.getForObject(url, BerriesDTO.class)).getResults();

        return berries;
    }

}
