package com.csv.Pokedexapi.models.BerryModels;

import com.csv.Pokedexapi.models.CommonModels.Name;
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
public class BerryFlavor implements PokeAPIResource {

    private int id;
    private String name;
    private List<FlavorBerryMap> berries;
//    private NamedAPIResource<ContestType> contestType;
    private List<Name> names;

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }
}
