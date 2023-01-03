package com.csv.Pokedexapi.models.PokemonModels.Stats;

import com.csv.Pokedexapi.models.CommonModels.APIResource;
import com.csv.Pokedexapi.models.CommonModels.Name;
import com.csv.Pokedexapi.models.PokemonModels.Characteristics.Characteristic;

import java.util.List;

public class Stat {

    private int id;
    private String name;
    private int game_index;
    private boolean is_battle_only;
    private List<MoveStatAffectSets> affecting_moves;
    private List<NatureStatAffectSets> affecting_natures;
    private APIResource<Characteristic> characteristics;
//    private NamedAPIResource<MoveDamageClass> move_damage_class;
    private List<Name> names;
}
