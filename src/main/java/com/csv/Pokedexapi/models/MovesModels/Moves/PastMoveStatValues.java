package com.csv.Pokedexapi.models.MovesModels.Moves;

import com.csv.Pokedexapi.models.CommonModels.NamedAPIResource;
import com.csv.Pokedexapi.models.CommonModels.VerboseEffect;
import com.csv.Pokedexapi.models.PokemonModels.Types.Type;

import java.util.List;

public class PastMoveStatValues {

    private int accuracy;
    private int effect_chance;
    private int power;
    private int pp;
    private List<VerboseEffect> effect_entries;
    private NamedAPIResource<Type> type;
    private NamedAPIResource<VersionGroup> version_group;
}
