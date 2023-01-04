package com.csv.Pokedexapi.models.PokemonModels.Types;

import com.csv.Pokedexapi.models.CommonModels.GenerationGameIndex;
import com.csv.Pokedexapi.models.CommonModels.Name;
import com.csv.Pokedexapi.models.CommonModels.PokeAPIResource;

import java.util.List;

public class Type implements PokeAPIResource {

    private int id;
    private String name;
    private List<TypeRelations> damage_relations;
    private List<TypeRelationsPast> past_damage_relations;
    private List<GenerationGameIndex> game_indices;
//    private NamedAPIResource<Generation> generation;
//    private NamedAPIResource<MoveDamageClass> move_damage_class;
    private List<Name> names;
    private List<TypePokemon> pokemon;
    //    private NamedAPIResource<Move> moves;

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }
}
