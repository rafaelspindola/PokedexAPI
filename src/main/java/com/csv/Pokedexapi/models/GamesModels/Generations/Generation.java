package com.csv.Pokedexapi.models.GamesModels.Generations;

import com.csv.Pokedexapi.models.CommonModels.Name;
import com.csv.Pokedexapi.models.CommonModels.NamedAPIResource;
import com.csv.Pokedexapi.models.MovesModels.Moves.Move;
import com.csv.Pokedexapi.models.PokemonModels.Abilities.Ability;
import com.csv.Pokedexapi.models.PokemonModels.PokemonSpecies.PokemonSpecies;
import com.csv.Pokedexapi.models.PokemonModels.Types.Type;

import java.util.List;

public class Generation {

    private int id;
    private String name;
    private NamedAPIResource<Ability> abilities;
    private List<Name> names;
    private NamedAPIResource<Region> regions;
    private NamedAPIResource<Move> moves;
    private NamedAPIResource<PokemonSpecies> pokemon_species;
    private NamedAPIResource<Type> types;
    private NamedAPIResource<VersionGroup> version_group;
}
