package etiyaGamesLayered.business.abstracts;

import etiyaGamesLayered.entities.concretes.User;

public interface UserValidatorService {
	
	boolean isValid(User user);
	
}
