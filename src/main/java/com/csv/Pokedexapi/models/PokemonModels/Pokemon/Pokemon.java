package com.csv.Pokedexapi.models.PokemonModels.Pokemon;

import java.util.List;

public class Pokemon {

    private int id;
    private String name;
    private int base_experience;
    private int height;
    private boolean is_default;
    private int order;
    private int weight;
    private List<PokemonAbility> abilities;
//    private NamedAPIResource<PokemonForm> forms;
//    private List<VersionGameIndex> game_indices;
    private List<PokemonHeldItem> held_items;
    private String location_area_encounters;
    private List<PokemonMove> moves;
    private List<PokemonTypePast> past_types;
    private List<PokemonSprites> sprites;
//    private NamedAPIResource<PokemonSpecies> species;
    private List<PokemonStat> stats;
    private List<PokemonType> types;

}
