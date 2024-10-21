package com.ervisjelvez.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.ervisjelvez.modelos.Artista;
import com.ervisjelvez.servicios.ServicioArtistas;


@Controller
public class ControladorArtista {
	
	@Autowired
	private ServicioArtistas servicioArtistas;
	
	public ControladorArtista(ServicioArtistas servicioArtistas) {
		this.servicioArtistas = servicioArtistas;
	}
	
	//desplegartodos
	@GetMapping("/artistas")
	public String desplegarArtistas(Model model) {
		List<Artista> artistas = this.servicioArtistas.obtenerTodosLosArtistas();
		model.addAttribute("artistas", artistas);
		return "artistas.jsp";
	}
	//detalle
	@GetMapping("/artistas/detalle/{idArtista}")
    public String desplegarDetalleArtista(@PathVariable("idArtista") Long idArtista, Model model) {
        Artista artista = servicioArtistas.obtenerArtistaPorId(idArtista);
        model.addAttribute("artista", artista);
        return "detalleArtista.jsp";
    }
	//agregar
    @GetMapping("/artistas/formulario/agregar")
    public String formularioAgregarArtista(Model model) {
        model.addAttribute("artista", new Artista());
        return "agregarArtista.jsp";
    }
    @PostMapping("/procesa/agregar")
    public String procesarAgregarArtista(@ModelAttribute("artista") Artista artista) {
        servicioArtistas.agregarArtista(artista);
        return "redirect:/artistas";
    }
}
