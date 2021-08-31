package etiyaGamesLayered.business.concretes;

import java.util.List;

import etiyaGamesLayered.business.abstracts.GameService;
import etiyaGamesLayered.dataAccess.concretes.GameDao;
import etiyaGamesLayered.entities.concretes.Game;

public class GameManager implements GameService {

	GameDao gameDao;
	
	public GameManager(GameDao gameDao) {
		super();
		this.gameDao = gameDao;
	}

	@Override
	public void add(Game game) {
		gameDao.add(game);
		
	}

	@Override
	public void list() {
		gameDao.list();
		
	}

	@Override
	public void update(Game game) {
		gameDao.update(game);
		
	}

	@Override
	public void delete(Game game) {
		gameDao.delete(game);
		
	}

	@Override
	public List<Game> getAll() {
		return gameDao.getAll();
	}

	
}
