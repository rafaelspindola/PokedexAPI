package com.csv.Pokedexapi.models.PokemonModels.Pokemon;

import com.csv.Pokedexapi.models.CommonModels.NamedAPIResource;
import com.csv.Pokedexapi.models.ItemsModels.Item;

import java.util.List;

public class PokemonHeldItem {

    private NamedAPIResource<Item> item;
    private List<PokemonHeldItemVersion> version_details;
}
