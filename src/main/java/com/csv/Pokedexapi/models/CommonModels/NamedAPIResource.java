package com.csv.Pokedexapi.models.CommonModels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class NamedAPIResource<T extends PokeAPIResource> {

    private String name;
    private String url;
}
