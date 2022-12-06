package com.csv.Pokedexapi.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Berry {

    private int id;
    private String name;
    private int growth_time;
    private int max_harvest;
    private int natural_gift_power;
    private int size;
    private int smoothness;
    private int soil_dryness;


    public String toString() {
        return "Id: " + id
                + "\nName: " + name
                + "\nGrowth time: " + growth_time
                + "\nMax harvest: " + max_harvest
                + "\nNatural gift power: " +natural_gift_power
                + "\nSize: " + size
                + "\nSmoothness: " + smoothness
                + "\nSoil dryness: " + soil_dryness;

    }
}


