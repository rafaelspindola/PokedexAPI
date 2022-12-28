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
public class ItemPocket implements PokeAPIResource {

    private int id;
    private String name;
    private NamedAPIResource<ItemCategory> categories;
    private List<Name> names;
}
