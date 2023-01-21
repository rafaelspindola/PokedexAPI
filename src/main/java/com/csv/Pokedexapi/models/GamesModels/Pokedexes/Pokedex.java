package com.csv.Pokedexapi.models.GamesModels.Pokedexes;

import com.csv.Pokedexapi.models.CommonModels.Description;
import com.csv.Pokedexapi.models.CommonModels.Name;
import com.csv.Pokedexapi.models.CommonModels.NamedAPIResource;

import javax.swing.plaf.synth.Region;
import java.util.List;

public class Pokedex {

    private int id;
    private String name;
    private boolean is_main_series;
    private List<Description> descriptions;
    private List<Name> names;
    private List<PokemonEntry> pokemon_entries;
    private NamedAPIResource<Region> region;
    private List<NamedAPIResource<VersionGroup>> version_groups;
}
