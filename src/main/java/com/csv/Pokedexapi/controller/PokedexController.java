package com.csv.Pokedexapi.controller;

import com.csv.Pokedexapi.models.BerryModels.Berry;
import com.csv.Pokedexapi.service.PokedexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping
public class PokedexController {

    @Autowired
    private PokedexService pokedexService;

    @GetMapping(value = "/berry")
    public ModelAndView getBerries() {
        List<Berry> berry = pokedexService.getBerries();
        return pokedexService.htmlRender("berry", berry);
    }


//    @GetMapping(value = "/berry") // better method to request get, but without mv
//    public ResponseEntity<List<Berry>> getBerries() {
//        List<Berry> json = pokedexService.getBerries();
//        return ResponseEntity.ok(json);
//    }




    @GetMapping(value = "/berry/{id}") // gets specific berry
    public ResponseEntity<Berry> getBerry(@PathVariable int id) {
        String url = "https://pokeapi.co/api/v2/berry/" + id;
        RestTemplate restTemplate = new RestTemplate();
        Berry berry = (restTemplate.getForObject(url, Berry.class));
        if (berry == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        return ResponseEntity.ok(berry);
    }
}

