package etiyaGamesLayered.dataAccess.abstracts;

import java.util.List;

public interface CrudRepository<T> {

	List<T> getAll();
	
	void add(T entity);
	
	void list();
	
	void update(T entity);
	
	void delete(T entity);
	
}
