package com.csv.Pokedexapi.models.PokemonModels.Pokemon;

import com.csv.Pokedexapi.models.CommonModels.NamedAPIResource;
import com.csv.Pokedexapi.models.PokemonModels.Abilities.Ability;

public class PokemonAbility {
    private boolean is_hidden;
    private int slot;
    private NamedAPIResource<Ability> ability;
}
