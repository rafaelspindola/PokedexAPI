package com.csv.Pokedexapi.models.PokemonModels.Pokemon;

import com.csv.Pokedexapi.models.CommonModels.NamedAPIResource;
import com.csv.Pokedexapi.models.CommonModels.PokeAPIResource;
import com.csv.Pokedexapi.models.PokemonModels.PokemonForms.PokemonForm;
import com.csv.Pokedexapi.models.PokemonModels.PokemonSpecies.PokemonSpecies;

import java.util.List;

public class Pokemon implements PokeAPIResource {

    private int id;
    private String name;
    private int base_experience;
    private int height;
    private boolean is_default;
    private int order;
    private int weight;
    private List<PokemonAbility> abilities;
    private NamedAPIResource<PokemonForm> forms;
//    private List<VersionGameIndex> game_indices;
    private List<PokemonHeldItem> held_items;
    private String location_area_encounters;
    private List<PokemonMove> moves;
    private List<PokemonTypePast> past_types;
    private List<PokemonSprites> sprites;
    private NamedAPIResource<PokemonSpecies> species;
    private List<PokemonStat> stats;
    private List<PokemonType> types;

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }
}
