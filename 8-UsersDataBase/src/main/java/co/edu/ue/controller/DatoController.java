package co.edu.ue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.edu.ue.entity.Dato;

import co.edu.ue.service.IDatoService;

@RestController
public class DatoController { //SE COMUNICA CON EL SERVICIO 
	
	@Autowired
	IDatoService service;
	/*
	 * VALIDACIONES CON EXPRESIONES REGULARES
	 */
	
	@PostMapping(value="dato-sav")
	public List<Dato>postDato(@RequestBody Dato dato){
		return service.addDato(dato);
	}
	
	@GetMapping(value="dato-all")
	public List<Dato>getAllDato(){
		return service.listall();
	}
	
	@PutMapping()
	public Dato putDato(@RequestParam Dato dato){
		/*BUSCAR QUE EL DATO EXISTA -> CAPA SERVICE
		 * 2. SI EXISTE ACTUALIZO
		 * 3. ACTUALIZACION P+OR ID
		 */
		return service.upDato(dato);
	}
	
	@GetMapping(value="datp-id")
	public Dato getIdDato(@RequestParam("id")int id) {
		return service.findIdDato(id);
	}
	
	@GetMapping(value="datp-email")
	public Dato getIdDato(@RequestParam("email")String mail) {
		return service.findEmailDato(mail);
		}
	
}
