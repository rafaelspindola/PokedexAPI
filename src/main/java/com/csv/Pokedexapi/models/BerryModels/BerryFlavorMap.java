package com.csv.Pokedexapi.models.BerryModels;

import com.csv.Pokedexapi.models.CommonModels.NamedAPIResource;
import com.csv.Pokedexapi.models.CommonModels.PokeAPIResource;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BerryFlavorMap implements PokeAPIResource {

    private int potency;
    private NamedAPIResource<BerryFlavor> flavor;

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }
}
