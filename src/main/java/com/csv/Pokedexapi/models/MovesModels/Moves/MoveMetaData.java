package com.csv.Pokedexapi.models.MovesModels.Moves;

import com.csv.Pokedexapi.models.CommonModels.NamedAPIResource;
import com.csv.Pokedexapi.models.MovesModels.MoveAilments.MoveAilment;
import com.csv.Pokedexapi.models.MovesModels.MoveCategories.MoveCategory;

public class MoveMetaData {

    private NamedAPIResource<MoveAilment> move_ailment;
    private NamedAPIResource<MoveCategory> move_category;
    private int min_hits;
    private int max_hits;
    private int min_turns;
    private int max_turns;
    private int drain;
    private int healing;
    private int crit_rate;
    private int ailment_chance;
    private int flinch_chance;
    private int stat_chance;
}
