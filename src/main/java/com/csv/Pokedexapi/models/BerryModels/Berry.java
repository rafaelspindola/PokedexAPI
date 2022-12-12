package com.csv.Pokedexapi.models.BerryModels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Berry {


    private int id;

    private String name;
    private String url;
    private int growth_time;
    private int max_harvest;
    private int natural_gift_power;
    private int size;
    private int smoothness;
    private int soil_dryness;
//    private NamedAPIResource<BerryFirmness> firmness;


}
