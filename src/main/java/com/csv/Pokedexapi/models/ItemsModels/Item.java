package com.csv.Pokedexapi.models.ItemsModels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Item {

    private int id;
    private String name;
    private int cost;
    private int fling_power;
    private String url;
    // private NamedAPIResource<ItemFlingEffect> fling_effect;
    // private NamedAPIResource<ItemAttribute> attributes;
    // private NamedAPIResource<ItemCategory> category;
    // private List<VerboseEffect> effect_entries;
    // private List<VersionGroupFlavorText> flavor_text_entries;
    // private List<GenerationGameIndex> game_indices;
    // private List<Name> names;
    // private List<ItemSprites> sprites; // ?
    // private List<ItemHolderPokemon> held_by_pokemon;
    // private APIResource<EvolutionChain> baby_trigger_for;
    // private List<MachineVersionDetail> machines;

}
