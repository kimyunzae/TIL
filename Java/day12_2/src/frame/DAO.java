package frame;

import java.util.List;	// ctrl + shift + o 

public interface DAO<K, V> {

	//CRUD		
	public void insert(V v) throws Exception;	
	public void delete(K k) throws Exception; 			
	public void update(V v) throws Exception; 		
	public V select(K k) throws Exception; 	
	public List<V> select() throws Exception;    
	
}