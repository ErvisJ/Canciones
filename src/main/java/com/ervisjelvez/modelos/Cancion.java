package com.ervisjelvez.modelos;
//import java.util.Date;//
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Size;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;

@Entity
@Table(name="canciones")
public class Cancion {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Long id;
	
	@Size(min=5)
	private String título;
	
	@Size(min=3)
	private String artista;
	
	@Size(min=3)
	private String álbum;
	
	@Size(min=3)
	private String género;
	
	@Size(min=3)
	private String idioma;
	
	 @Temporal(TemporalType.DATE)
	 @Column(name = "fecha_creacion")
	 private Date fechaCreacion;
	 @Temporal(TemporalType.DATE)
	 @Column(name = "fecha_actualizacion")
	 private Date fechaActualizacion;
	 
	 
	 public Cancion() {}
	 
	 
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTítulo() {
		return título;
	}
	public void setTítulo(String título) {
		this.título = título;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getÁlbum() {
		return álbum;
	}
	public void setÁlbum(String álbum) {
		this.álbum = álbum;
	}
	public String getGénero() {
		return género;
	}
	public void setGénero(String género) {
		this.género = género;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Date getFechaActualizacion() {
		return fechaActualizacion;
	}
	public void setFechaActualizacion(Date fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}
	    
	@PrePersist
	protected void onCreate() {
		this.fechaCreacion = new Date();
		this.fechaActualizacion = this.fechaCreacion;
	}
	 
}
