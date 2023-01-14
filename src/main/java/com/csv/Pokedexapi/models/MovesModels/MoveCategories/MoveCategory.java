package com.csv.Pokedexapi.models.MovesModels.MoveCategories;

import com.csv.Pokedexapi.models.CommonModels.Description;
import com.csv.Pokedexapi.models.CommonModels.NamedAPIResource;
import com.csv.Pokedexapi.models.CommonModels.PokeAPIResource;
import com.csv.Pokedexapi.models.MovesModels.Moves.Move;

import java.util.List;

public class MoveCategory implements PokeAPIResource {

    private int id;
    private String name;
    private NamedAPIResource<Move> moves;
    private List<Description> descriptions;

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }
}
