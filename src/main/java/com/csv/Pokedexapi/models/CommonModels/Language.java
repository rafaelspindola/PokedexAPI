package com.csv.Pokedexapi.models.CommonModels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Language implements PokeAPIResource {
    private Integer id;
    private String name;
    private boolean official;
    private String iso639;
    private String iso3166;
    private List<Name> names;

}
