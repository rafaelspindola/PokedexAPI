package com.csv.Pokedexapi.controller;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(url = "https://pokeapi.co/api/v2/berry", name = "berry")
public class PokedexController {


}

