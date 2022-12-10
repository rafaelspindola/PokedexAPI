package com.csv.Pokedexapi.DTO;

import com.csv.Pokedexapi.models.Berry;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BerriesDTO {

    private List<Berry> results = new ArrayList<>();

}
