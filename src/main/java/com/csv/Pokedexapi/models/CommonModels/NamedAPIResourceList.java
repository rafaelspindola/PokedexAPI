package com.csv.Pokedexapi.models.CommonModels;


import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

public class NamedAPIResourceList<T extends PokeAPIResource> implements PokeAPIResource{

    private Integer count;
    private String next;
    private Boolean previous;
    private List<NamedAPIResource<T>> results;

    @Override
    @JsonIgnore
    public int getId() {
        return 0;
    }

    @Override
    @JsonIgnore
    public String getName() {
        return "";
    }
}
