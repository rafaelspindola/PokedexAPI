package com.csv.Pokedexapi.models.PokemonModels.PokeathlonStats;

import com.csv.Pokedexapi.models.CommonModels.NamedAPIResource;
import com.csv.Pokedexapi.models.CommonModels.PokeAPIResource;
import com.csv.Pokedexapi.models.PokemonModels.Natures.Nature;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NaturePokeathlonStatAffect implements PokeAPIResource {

    private int max_change;
    private NamedAPIResource<Nature> nature;

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }
}
