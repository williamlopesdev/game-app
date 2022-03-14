package br.senai.sp.jandira.gamesapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.senai.sp.jandira.gamesapp.model.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
}
