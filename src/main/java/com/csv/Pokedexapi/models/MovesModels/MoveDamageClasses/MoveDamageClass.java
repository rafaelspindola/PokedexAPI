package com.csv.Pokedexapi.models.MovesModels.MoveDamageClasses;

import com.csv.Pokedexapi.models.CommonModels.Description;
import com.csv.Pokedexapi.models.CommonModels.Name;

import java.util.List;

public class MoveDamageClass {

    private int id;
    private String name;
    private List<Description> descriptions;
//    private NamedAPIResource<Move> moves;
    private List<Name> names;
}
