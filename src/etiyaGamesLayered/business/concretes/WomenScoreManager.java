package etiyaGamesLayered.business.concretes;

import etiyaGamesLayered.business.abstracts.ScoreService;
import etiyaGamesLayered.entities.concretes.Game;
import etiyaGamesLayered.entities.concretes.Gamer;

public class WomenScoreManager implements ScoreService {

	@Override
	public double score(Gamer gamer, Game game) {		
		if(gamer.getGender()!="Male") {
			System.out.println("Cinsiyet uygun değil.");
			return 0;
		} else {
		return game.getTotalScore()*0.7;
		}
	}

}