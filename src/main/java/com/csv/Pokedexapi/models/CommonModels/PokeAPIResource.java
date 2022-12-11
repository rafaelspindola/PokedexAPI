package com.csv.Pokedexapi.models.CommonModels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public interface PokeAPIResource {

    Integer getId();
    String getName();
}
