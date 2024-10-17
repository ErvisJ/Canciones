package com.ervisjelvez.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ervisjelvez.modelos.Cancion;
import com.ervisjelvez.repositorios.RepositorioCanciones;

@Service
public class ServicioCanciones {
	
	@Autowired
	private final RepositorioCanciones repositorioCanciones;
	public ServicioCanciones(RepositorioCanciones repositorioCanciones) {
		this.repositorioCanciones=repositorioCanciones;
	}
	 public List<Cancion> obtenerTodasLasCanciones(){
		 return this.repositorioCanciones.findAll();
	 }
	 public Cancion obtenerCancionPorId(Long id) {
	        Optional<Cancion> cancion = repositorioCanciones.findById(id);
	        return cancion.orElse(null);
	    }
	 
	 public Cancion agregarCancion(Cancion cancion) {
		 return repositorioCanciones.save(cancion);
	 }
	 
	 public void eliminarCancion(Long idCancion) {
		 this.repositorioCanciones.deleteById(idCancion);
	 }
	 
	 /*public Cancion actualizaCancion(Cancion cancion) {
	        if (repositorioCanciones.existsById(cancion.getId(idCancion))) {
	            return repositorioCanciones.save(cancion);  // Actualizamos la canción existente
	        }
	 }*/
	 
	public Cancion actualizarCancion(Cancion cancion) {
		 return this.repositorioCanciones.save(cancion);
	 }
}
