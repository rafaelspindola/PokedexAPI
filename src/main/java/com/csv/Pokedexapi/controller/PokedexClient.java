package com.csv.Pokedexapi.controller;

import com.csv.Pokedexapi.models.Berry;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://pokeapi.co/api/v2/berry", name = "berry")
public interface PokedexClient {

    @GetMapping("https://pokeapi.co/api/v2/berry")
    Berry searchForBerry(@PathVariable("berry") String berry);
}
