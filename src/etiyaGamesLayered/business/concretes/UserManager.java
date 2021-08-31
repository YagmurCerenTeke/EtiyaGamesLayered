package etiyaGamesLayered.business.concretes;

import java.util.List;

import etiyaGamesLayered.business.abstracts.UserService;
import etiyaGamesLayered.dataAccess.concretes.UserDao;
import etiyaGamesLayered.entities.concretes.User;

public class UserManager implements UserService {

	UserDao userDao;
	MernisKpsServiceAdapter mernisKpsServiceAdapter;
	
	public UserManager(UserDao userDao, MernisKpsServiceAdapter mernisKpsServiceAdapter) {
		super();
		this.userDao = userDao;
		this.mernisKpsServiceAdapter = mernisKpsServiceAdapter;
	}

	@Override
	public void add(User user) {
		if(mernisKpsServiceAdapter.isValid(user)) {
			userDao.add(user);
		}else {
			System.out.println("User is not valid.");
		}
		
	}

	@Override
	public void list() {
		userDao.list();
		
	}

	@Override
	public void update(User user) {
		if(mernisKpsServiceAdapter.isValid(user)) {
			userDao.update(user);
		}else {
			System.out.println("User info is not valid.");
		}
		
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
		
	}

	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}
	
	
}
