package com.ervisjelvez.repositorios;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ervisjelvez.modelos.Cancion;


@Repository
public interface RepositorioCanciones extends CrudRepository<Cancion, Long> {
	/*SELECT *
	 * FROM canciones;
	 */
	List<Cancion> findAll(); 
	
	
	//void deleteById(Long idCancion);
}
