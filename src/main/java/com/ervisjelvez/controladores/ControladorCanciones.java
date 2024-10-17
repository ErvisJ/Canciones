package com.ervisjelvez.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.ervisjelvez.modelos.Cancion;
import com.ervisjelvez.servicios.ServicioCanciones;

import jakarta.validation.Valid;

@Controller
public class ControladorCanciones {
	@Autowired
    private ServicioCanciones servicioCanciones;
	
	public ControladorCanciones(ServicioCanciones servicioCanciones) {
		this.servicioCanciones = servicioCanciones;
	}
	//todas las canciones
     @GetMapping("/canciones")
   public String desplegarCanciones(Model modelo) {
    	List<Cancion> cancion= this.servicioCanciones.obtenerTodasLasCanciones();
    	modelo.addAttribute("canciones", cancion);
    	return "canciones.jsp";
    }
     //detalle canciones
     @GetMapping("/canciones/detalle/{idCancion}")
     public String desplegarDetalleCancion(@PathVariable("idCancion") Long idCancion, Model model) {
         Cancion cancion = servicioCanciones.obtenerCancionPorId(idCancion);
         model.addAttribute("cancion", cancion);
         return "detalleCancion.jsp";
     }
     //agregar canciones
     @GetMapping("/canciones/formulario/agregar/{idCancion}")
     public String formularioAgregarCancion(Model model) {
    	 model.addAttribute("cancion", new Cancion());
    	 return "agregarCancion.jsp";
     }
     
     @PostMapping("/canciones/procesa/agregar")
     public String procesarAgregarCancion(@Valid @ModelAttribute("cancion") Cancion cancion, BindingResult result, Model model) {
         if (result.hasErrors()) {
             return "agregarCancion.jsp";
         }
         servicioCanciones.agregarCancion(cancion);
         return "redirect:/canciones";
     }
     //editar
     @GetMapping("/canciones/formulario/editar/{idCancion}")
     public String formularioEditarCancion(@ModelAttribute("cancion") Cancion cancion, 
    		 							   @PathVariable ("idCancion") Long idCancion,
    		 							   Model modelo)  {
    	 cancion = servicioCanciones.obtenerCancionPorId(idCancion);
    	 modelo.addAttribute("cancion", cancion);
    	 return "editarCancion.jsp";
     }
     
     @PutMapping("/canciones/procesa/editar/{idCancion}")
 	public String procesarEditarCancion(@Valid @ModelAttribute ("cancion")Cancion cancion, 
 										BindingResult validation, 
 										@PathVariable Long idCancion) {
 		if(validation.hasErrors()) {
 			return "editarCancion.jsp";
 		}
 		cancion.setId(idCancion);
 		this.servicioCanciones.actualizarCancion(cancion);
 		return "redirect:/canciones";
 	}
     @DeleteMapping("/canciones/eliminar/{idCancion}")
     public String eliminarCancion(@PathVariable Long idCancion) {
    	 this.servicioCanciones.eliminarCancion(idCancion);
    	 return "redirect:/canciones";
     }
     
}

