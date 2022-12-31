package com.csv.Pokedexapi.models.PokemonModels.Abilities;

import com.csv.Pokedexapi.models.CommonModels.Name;
import com.csv.Pokedexapi.models.CommonModels.PokeAPIResource;
import com.csv.Pokedexapi.models.CommonModels.VerboseEffect;

import java.util.List;

public class Ability implements PokeAPIResource {

    private int id;
    private String name;
    private boolean is_main_series;
    //    private NamedAPIResource<Generation> generation;
    private List<Name> names;
    private List<VerboseEffect> effect_entries;
    private List<AbilityEffectChange> effect_changes;
    private List<AbilityFlavorText> flavor_text_entries;
    private List<AbilityPokemon> pokemon;
}
