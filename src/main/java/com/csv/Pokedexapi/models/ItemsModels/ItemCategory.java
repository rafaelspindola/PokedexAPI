package com.csv.Pokedexapi.models.ItemsModels;

import com.csv.Pokedexapi.models.CommonModels.Name;
import com.csv.Pokedexapi.models.CommonModels.NamedAPIResource;
import com.csv.Pokedexapi.models.CommonModels.PokeAPIResource;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemCategory implements PokeAPIResource {

    private int id;
    private String name;
    private NamedAPIResource<Item> items;
    private List<Name> names;
    private NamedAPIResource<ItemPocket> pocket;
}