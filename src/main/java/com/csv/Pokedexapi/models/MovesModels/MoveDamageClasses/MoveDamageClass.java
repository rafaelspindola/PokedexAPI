package com.csv.Pokedexapi.models.MovesModels.MoveDamageClasses;

import com.csv.Pokedexapi.models.CommonModels.Description;
import com.csv.Pokedexapi.models.CommonModels.Name;
import com.csv.Pokedexapi.models.CommonModels.NamedAPIResource;
import com.csv.Pokedexapi.models.CommonModels.PokeAPIResource;
import com.csv.Pokedexapi.models.MovesModels.Moves.Move;

import java.util.List;

public class MoveDamageClass implements PokeAPIResource {

    private int id;
    private String name;
    private List<Description> descriptions;
    private NamedAPIResource<Move> moves;
    private List<Name> names;

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }
}
