package etiyaGamesLayered.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import etiyaGamesLayered.dataAccess.abstracts.GameDaoRepository;
import etiyaGamesLayered.entities.concretes.Game;

public class GameDao implements GameDaoRepository {

	List<Game> games;
	
	public GameDao() {
		this.games = new ArrayList<Game>();
		this.games.add(new Game(4, "Portal", 180,100));
	}
	
	@Override
	public void add(Game game) {
		System.out.println(game.getName() + " has been added to database.");
		
	}

	@Override
	public void list() {
		System.out.println("Games are listed.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName() + " has been updated to database.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName() + " has been deleted from database.");
		
	}

	@Override
	public List<Game> getAll() {
		return this.games;
	}


}
