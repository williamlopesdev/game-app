package br.senai.sp.jandira.gamesapp.resource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import br.senai.sp.jandira.gamesapp.model.Game;
import br.senai.sp.jandira.gamesapp.repository.GameRepository;

@RestController
@RequestMapping("/")
public class GameResource {
	
	@Autowired
	private GameRepository gameRepository;
	
	@GetMapping("/")
	public String testar() {
		return "Olá mundo";
	}
	
	@GetMapping("/api/games")
	public List<Game> listar(){
		
		return gameRepository.findAll();
	}
	
	@GetMapping("/api/games/{id}")
	public Game listarJogoPorID(@PathVariable Long id){
		
		return gameRepository.findById(id).get();
	}
	
	@PostMapping("/api/games")
	@ResponseStatus(HttpStatus.CREATED)
	public Game save(@RequestBody Game game) {
		
		return gameRepository.save(game);
		
	}
	
	
}
