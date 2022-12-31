package com.csv.Pokedexapi.models.PokemonModels.GrowthRates;

import com.csv.Pokedexapi.models.CommonModels.Description;

import java.util.List;

public class GrowthRate {

    private int id;
    private String name;
    private String formula;
    private List<Description> descriptions;
    private List<GrowthRateExperienceLevel> levels;
//    private NamedAPIResource<PokemonSpecies> pokemon_species;
}
