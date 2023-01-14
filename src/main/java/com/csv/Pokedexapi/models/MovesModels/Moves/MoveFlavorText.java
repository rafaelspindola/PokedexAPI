package com.csv.Pokedexapi.models.MovesModels.Moves;

import com.csv.Pokedexapi.models.CommonModels.Language;
import com.csv.Pokedexapi.models.CommonModels.NamedAPIResource;

public class MoveFlavorText {

    private String flavor_text;
    private NamedAPIResource<Language> language;
    private NamedAPIResource<VersionGroup> version_group;
}
