package com.csv.Pokedexapi.models.ItemsModels;

import com.csv.Pokedexapi.models.CommonModels.NamedAPIResource;
import com.csv.Pokedexapi.models.PokemonModels.Pokemon.Pokemon;

import java.util.List;

public class ItemHolderPokemon {

    private NamedAPIResource<Pokemon> pokemon;
    private List <ItemHolderPokemonVersionDetail> version_details;
}
