package etiyaGamesLayered.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import etiyaGamesLayered.dataAccess.abstracts.UserDaoRepository;
import etiyaGamesLayered.entities.concretes.Gamer;
import etiyaGamesLayered.entities.concretes.User;


public class UserDao implements UserDaoRepository{

	List<User> users;
	
	public UserDao() {
		this.users = new ArrayList<User>();
		this.users.add(new Gamer("Ercan","Teke",2009,"12345678913", "Male", 100));
	}

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + " has been added to database.");
		
	}

	@Override
	public void list() {
		System.out.println("Users are listed.");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " has been updated to database.");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " has been deleted from database.");
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return this.users;
	}

}
