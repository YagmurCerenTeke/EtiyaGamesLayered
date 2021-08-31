package etiyaGamesLayered.business.abstracts;

import etiyaGamesLayered.entities.concretes.Campaign;
import etiyaGamesLayered.entities.concretes.Game;
import etiyaGamesLayered.entities.concretes.User;

public interface SellingService {
	
	void selling(User user, Game game);

	void selling(User user,Game game, Campaign campaign);
}
