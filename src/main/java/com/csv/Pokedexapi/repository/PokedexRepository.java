package com.csv.Pokedexapi.repository;

import com.csv.Pokedexapi.models.Berry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokedexRepository extends JpaRepository<Berry,Long> {}

