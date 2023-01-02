package com.csv.Pokedexapi.models.PokemonModels.PokemonForms;

import com.csv.Pokedexapi.models.CommonModels.Name;
import com.csv.Pokedexapi.models.CommonModels.NamedAPIResource;
import com.csv.Pokedexapi.models.CommonModels.PokeAPIResource;
import com.csv.Pokedexapi.models.PokemonModels.Pokemon.Pokemon;
import com.csv.Pokedexapi.models.PokemonModels.Pokemon.PokemonFormType;

import java.util.List;

public class PokemonForm implements PokeAPIResource {

    private int id;
    private String name;
    private int order;
    private int form_order;
    private boolean is_default;
    private boolean is_battle_only;
    private boolean is_mega;
    private String form_name;
    private NamedAPIResource<Pokemon> pokemon;
    private List<PokemonFormType> types;
    private List<PokemonFormSprites> sprites;
//    private NamedAPIResource<VersionGroup> version_group;
    private List<Name> names;
    private List<Name> form_names;

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }
}
