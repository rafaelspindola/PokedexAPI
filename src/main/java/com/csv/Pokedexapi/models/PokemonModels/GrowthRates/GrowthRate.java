package com.csv.Pokedexapi.models.PokemonModels.GrowthRates;

import com.csv.Pokedexapi.models.CommonModels.Description;
import com.csv.Pokedexapi.models.CommonModels.NamedAPIResource;
import com.csv.Pokedexapi.models.CommonModels.PokeAPIResource;
import com.csv.Pokedexapi.models.PokemonModels.PokemonSpecies.PokemonSpecies;

import java.util.List;

public class GrowthRate implements PokeAPIResource {

    private int id;
    private String name;
    private String formula;
    private List<Description> descriptions;
    private List<GrowthRateExperienceLevel> levels;
    private NamedAPIResource<PokemonSpecies> pokemon_species;

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }
}
