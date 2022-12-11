package com.csv.Pokedexapi.controller;

import com.csv.Pokedexapi.DTO.BerriesDTO;
import com.csv.Pokedexapi.models.BerryModels.Berry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping
public class PokedexController {

    @GetMapping(value = "/berry")
    public ModelAndView getBerries() {
        String url = "https://pokeapi.co/api/v2/berry";
        RestTemplate restTemplate = new RestTemplate();
        List<Berry> berries = Objects.requireNonNull(restTemplate.getForObject(url, BerriesDTO.class)).getResults();

        ModelAndView mv = new ModelAndView("berry");
        mv.addObject("berry", berries);

        return mv;
    }
}

