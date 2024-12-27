package com.edu.ue.service;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//el controller es la capa que me va a conectar con el cliente
//es el que va a recibir todas las peticiones
//tiene metodos que se van a comunicar con el servicio

@RestController
public class PrimerController { 
	
	//Mi primer microservicio
	@GetMapping (value = "welcome", produces = MediaType.APPLICATION_JSON_VALUE)//este es el endpoint "welcome"                  
	public String bienvenida() {             //este es el metodo para agregarle un endpoint
		return "Bienvenido a SprintBoot";
	}
	
	
	//Recibir párametros en la petición get 
	@GetMapping (value = "welcome/{name}")
	public String bienvenidaPersonalizada(@PathVariable("name") String nombre) { //viene contenido en el Path
		return "Bienvenido a SprintBoot " + nombre;	
	}
	
	@RequestMapping (value = "welcomes",method = RequestMethod.GET)  //Recibire el apellido una peticion debo cambiar el endpoint a welcomes
	public String bienvenidaPersonalizada(@RequestParam("name")String nombre,
			@RequestParam("lastname")String apellidos) { //viene contenido en el Path
		return "welcome " + nombre +" "+ apellidos;
		
	}
}