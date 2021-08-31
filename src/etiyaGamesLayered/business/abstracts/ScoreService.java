package etiyaGamesLayered.business.abstracts;

import etiyaGamesLayered.entities.concretes.Game;
import etiyaGamesLayered.entities.concretes.Gamer;

public interface ScoreService {

	double score(Gamer gamer, Game game); 
}
