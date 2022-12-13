package com.csv.Pokedexapi.models.CommonModels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public interface PokeAPIResource {

    int getId();
    String getName();
}
