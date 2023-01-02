package com.csv.Pokedexapi.models.PokemonModels.PokemonSpecies;

import com.csv.Pokedexapi.models.CommonModels.Description;
import com.csv.Pokedexapi.models.CommonModels.Name;
import com.csv.Pokedexapi.models.CommonModels.NamedAPIResource;
import com.csv.Pokedexapi.models.CommonModels.PokeAPIResource;
import com.csv.Pokedexapi.models.PokemonModels.EggGroups.EggGroup;
import com.csv.Pokedexapi.models.PokemonModels.GrowthRates.GrowthRate;
import com.csv.Pokedexapi.models.PokemonModels.PokemonColors.PokemonColor;
import com.csv.Pokedexapi.models.PokemonModels.PokemonHabitats.PokemonHabitat;
import com.csv.Pokedexapi.models.PokemonModels.PokemonShapes.PokemonShape;

public class PokemonSpecies implements PokeAPIResource {

    private int id;
    private String name;
    private int order;
    private int gender_rate;
    private int capture_rate;
    private int base_happiness;
    private boolean is_baby;
    private boolean is_legendary;
    private boolean is_mythical;
    private int hatch_encounter;
    private boolean has_gender_differences;
    private boolean forms_switchable;
    private NamedAPIResource<GrowthRate> growth_rate;
    private java.util.List<PokemonSpeciesDexEntry> pokedex_numbers;
    private NamedAPIResource<EggGroup> egg_groups;
    private NamedAPIResource<PokemonColor> color;
    private NamedAPIResource<PokemonShape> shape;
    private NamedAPIResource<PokemonSpecies> evolves_from_species;
//    private APIResource<EvolutionChain> evolution_chain;
    private NamedAPIResource<PokemonHabitat> habitat;
//    private NamedAPIResource<Generation> generation;
    private java.util.List<Name> names;
    private java.util.List<PalParkEncounterArea> pal_park_encounters;
//    private List<FlavorText> flavor_text_entries;
    private java.util.List<Description> descriptions;
    private java.util.List<Genus> genus;
    private java.util.List<PokemonSpeciesVariety> varieties;


    @Override
    public int getId() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }
}
