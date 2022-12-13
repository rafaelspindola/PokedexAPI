package com.csv.Pokedexapi.models.BerryModels;

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
public class Berry implements PokeAPIResource {


    private int id;

    private String name;
    private String url;
    private int growth_time;
    private int max_harvest;
    private int natural_gift_power;
    private int size;
    private int smoothness;
    private int soil_dryness;
    private NamedAPIResource<BerryFirmness> firmness;
    private List<BerryFlavorMap> flavors;
//    private NamedAPIResource<Item> item;
//    private NamedAPIResource<Type> type;


}
