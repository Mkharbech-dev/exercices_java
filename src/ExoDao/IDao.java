package ExoDao;

import java.util.List;

public interface IDao<T> {
	
	public void create(T objet);
	public List<T> read();
	public void update(T objet, int id);
	public void delete(int id);
	
	public T findById(int id);
	public List<T> findByName(String nom);
}
