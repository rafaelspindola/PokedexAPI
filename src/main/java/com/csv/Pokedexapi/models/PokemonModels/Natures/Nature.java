package com.csv.Pokedexapi.models.PokemonModels.Natures;

import com.csv.Pokedexapi.models.BerryModels.BerryFlavor;
import com.csv.Pokedexapi.models.CommonModels.Name;
import com.csv.Pokedexapi.models.CommonModels.NamedAPIResource;
import com.csv.Pokedexapi.models.CommonModels.PokeAPIResource;

import java.util.List;

public class Nature implements PokeAPIResource {

    private int id;
    private String name;
//    private NamedAPIResource<Stat> decreased_stat;
//    private NamedAPIResource<Stat> increased_stat;
    private NamedAPIResource<BerryFlavor> hates_flavor;
    private NamedAPIResource<BerryFlavor> likes_flavor;
    private List<NatureStatChange> pokeathlon_stat_changes;
    private List<MoveBattleStylePreference> move_battle_style_preferences;
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
