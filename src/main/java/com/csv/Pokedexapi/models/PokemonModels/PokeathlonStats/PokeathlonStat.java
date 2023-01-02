package com.csv.Pokedexapi.models.PokemonModels.PokeathlonStats;

import com.csv.Pokedexapi.models.CommonModels.Name;
import com.csv.Pokedexapi.models.CommonModels.PokeAPIResource;

import java.util.List;

public class PokeathlonStat implements PokeAPIResource {

    private int id;
    private String name;
    private List<Name> names;
    private List<NaturePokeathlonStatAffectSets> affecting_natures;

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }
}
