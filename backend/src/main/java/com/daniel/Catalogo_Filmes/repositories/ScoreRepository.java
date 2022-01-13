package com.daniel.Catalogo_Filmes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daniel.Catalogo_Filmes.entities.Score;
import com.daniel.Catalogo_Filmes.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
