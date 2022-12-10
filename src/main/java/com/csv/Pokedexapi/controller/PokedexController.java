package com.csv.Pokedexapi.controller;

import com.csv.Pokedexapi.DTO.BerriesDTO;
import com.csv.Pokedexapi.models.Berry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping
public class PokedexController {

    @GetMapping(value = "/berry")
    public List<Berry> getBerries() {
        String url = "https://pokeapi.co/api/v2/berry/";
        RestTemplate restTemplate = new RestTemplate();

        List<Berry> berries = Objects.requireNonNull(restTemplate.getForObject(url, BerriesDTO.class)).getResults();

        return berries;
    }


}

