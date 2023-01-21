package com.csv.Pokedexapi.models.GamesModels.Pokedexes;

import com.csv.Pokedexapi.models.CommonModels.NamedAPIResource;
import com.csv.Pokedexapi.models.PokemonModels.PokemonSpecies.PokemonSpecies;

public class PokemonEntry {

    private int entry_number;
    private NamedAPIResource<PokemonSpecies> pokemon_species;
}
