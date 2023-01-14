package com.csv.Pokedexapi.models.MovesModels.Moves;

import com.csv.Pokedexapi.models.CommonModels.*;
import com.csv.Pokedexapi.models.MovesModels.MoveDamageClasses.MoveDamageClass;
import com.csv.Pokedexapi.models.MovesModels.MoveTargets.MoveTarget;
import com.csv.Pokedexapi.models.PokemonModels.Abilities.AbilityEffectChange;
import com.csv.Pokedexapi.models.PokemonModels.Pokemon.Pokemon;
import com.csv.Pokedexapi.models.PokemonModels.Types.Type;

import java.util.List;

public class Move implements PokeAPIResource {

    private int id;
    private String name;
    private int accuracy;
    private int effect_chance;
    private int pp;
    private int priority;
    private int power;
    private List<ContestComboSets> contest_combos;
    private NamedAPIResource<ContestType> contest_type;
    private APIResource<ContestEffect> contest_effect;
    private NamedAPIResource<MoveDamageClass> damage_class;
    private List<VerboseEffect> effect_entries;
    private List<AbilityEffectChange> effect_changes;
    private NamedAPIResource<Pokemon> learned_by_pokemon;
    private List<MoveFlavorText> flavor_text_entries;
    private NamedAPIResource<Generation> generation;
    private List<MachineVersionDetail> machines;
    private List<MoveMetaData> data;
    private List<Name> names;
    private List<PastMoveStatValues> past_values;
    private List<MoveStatChange> stat_changes;
    private APIResource<SuperContestEffect> super_contest_effect;
    private NamedAPIResource<MoveTarget> target;
    private NamedAPIResource<Type> type;
}
