package etiyaGamesLayered.business.concretes;

import java.time.LocalDate;

import etiyaGamesLayered.business.abstracts.ScoreService;
import etiyaGamesLayered.entities.concretes.Game;
import etiyaGamesLayered.entities.concretes.Gamer;

public class ChildScoreManager implements ScoreService {

	@Override
	public double score(Gamer gamer, Game game) {
		if (LocalDate.now().getYear()-gamer.getBirthYear()>=18) {
			System.out.println("Yaş uygun değil.");
			return 0;
		} else {
			return game.getTotalScore() * 1;
		}
	}

}
