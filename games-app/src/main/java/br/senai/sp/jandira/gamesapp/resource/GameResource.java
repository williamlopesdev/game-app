package br.senai.sp.jandira.gamesapp.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

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
	
	@PostMapping("/api/games")
	@ResponseStatus(HttpStatus.CREATED)
	public Game save(@RequestBody Game game) {
		
		return gameRepository.save(game);
		
	}
}
