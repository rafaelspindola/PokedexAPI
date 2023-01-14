package com.csv.Pokedexapi.models.MovesModels.MoveAilments;

import com.csv.Pokedexapi.models.CommonModels.Name;
import com.csv.Pokedexapi.models.CommonModels.NamedAPIResource;
import com.csv.Pokedexapi.models.CommonModels.PokeAPIResource;
import com.csv.Pokedexapi.models.MovesModels.Moves.Move;

import java.util.List;

public class MoveAilment implements PokeAPIResource {

    private int id;
    private String name;
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
