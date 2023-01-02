package com.csv.Pokedexapi.models.PokemonModels.Genders;

import com.csv.Pokedexapi.models.CommonModels.NamedAPIResource;
import com.csv.Pokedexapi.models.PokemonModels.PokemonSpecies.PokemonSpecies;

import java.util.List;

public class Gender {

    private int id;
    private String name;
    private List<PokemonSpeciesGender> pokemon_species_details;
    private NamedAPIResource<PokemonSpecies> required_for_evolution;

}
