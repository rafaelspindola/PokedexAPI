package com.csv.Pokedexapi.models.ItemsModels;

import com.csv.Pokedexapi.models.CommonModels.Effect;
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
public class ItemFlingEffect implements PokeAPIResource {

    private int id;
    private String name;
    private List<Effect> effect_entries;
    private NamedAPIResource<Item> items;
}
