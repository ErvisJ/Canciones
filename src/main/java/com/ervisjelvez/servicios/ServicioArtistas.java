package com.ervisjelvez.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ervisjelvez.modelos.Artista;
import com.ervisjelvez.repositorios.RepositorioArtistas;

@Service
public class ServicioArtistas {
	
	@Autowired
	private final RepositorioArtistas repositorioArtistas;
	public ServicioArtistas(RepositorioArtistas repositorioArtistas) {
		this.repositorioArtistas = repositorioArtistas;
	}
	//obtenertodos
	public List<Artista> obtenerTodosLosArtistas(){
		return this.repositorioArtistas.findAll();
	}
	//por id
	public Artista obtenerArtistaPorId(Long id) {
		return repositorioArtistas.findById(id).orElse(null);
	}
	//agregar artista
	public Artista agregarArtista(Artista artista) {
		return this.repositorioArtistas.save(artista);
	}

}
