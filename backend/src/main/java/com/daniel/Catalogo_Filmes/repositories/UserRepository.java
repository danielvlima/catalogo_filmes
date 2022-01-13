package com.daniel.Catalogo_Filmes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daniel.Catalogo_Filmes.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	User findByEmail(String email);
}
