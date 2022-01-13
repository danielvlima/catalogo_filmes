package com.daniel.Catalogo_Filmes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daniel.Catalogo_Filmes.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
