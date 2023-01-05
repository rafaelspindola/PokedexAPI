package com.csv.Pokedexapi.models.MovesModels;

import com.csv.Pokedexapi.models.CommonModels.Description;
import com.csv.Pokedexapi.models.CommonModels.Name;

import java.util.List;

public class MoveTarget {

    private int id;
    private String name;
    private List<Description> descriptions;
//    private NamedAPIResource<Move> moves;
    private List<Name> names;
}
