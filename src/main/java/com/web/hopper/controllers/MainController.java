package com.web.hopper.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.hopper.model.Venta;

@Controller
public class MainController {
	@RequestMapping("/")
	 public String home(Model model) {
			// Se declaran las variables, se inicializan ...
		    String name = "Grace Hopper";
	        String itemName = "Alambre de cobre";
	        double price = 5.25;
	        String description = "Tiras de metal, otra ilustración de nanosegundos.";
	        String vendedor = "Tienda de la esquina Pequeñas Cosas";
	        
	        // Declaramos un arraylist
	        ArrayList<String> arrayProducto = new ArrayList<String>();
	        arrayProducto.add("Rolin Espinoza");
	        arrayProducto.add("Laptop");
	        arrayProducto.add("7000.00");
	        arrayProducto.add("Laptop Asus Zenbook corei7");
	        arrayProducto.add("Asus Company SAC");
	        
	        // Declaramos una clase Venta e inicializamos
	        Venta classVenta = new Venta();
	        classVenta.setName("Nozari 7");
	    
	    	// ¡Tu código aquí! Agrega valores al modelo de vista que se representará
	        model.addAttribute("nombre", name);
	        model.addAttribute("item", itemName);
	        model.addAttribute("precio", price);
	        model.addAttribute("descripcion", description);
	        model.addAttribute("vendedor", vendedor);
	        // Pasamos el arraylist al modelo de la vista
	        model.addAttribute("arrProducto", arrayProducto);
	        // Pasamos la clase al modelo de la vista
	        model.addAttribute("ventaName", classVenta.getName());
	       
	        
	        
		 return "index.jsp";
	 }
	 
	 @RequestMapping("/producto")
	 public String producto(Model model) {
		 model.addAttribute("fruit", "watermelon 7");
		 return "producto.jsp";
	 }
}
