package com.csv.Pokedexapi.models.BerryModels;

import com.csv.Pokedexapi.models.CommonModels.NamedAPIResource;
import com.csv.Pokedexapi.models.CommonModels.PokeAPIResource;

public class BerryFirmness implements PokeAPIResource {

    private int id;
    private String name;
    private NamedAPIResource<Berry> firmness;

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }
}
