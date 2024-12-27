package co.edu.ue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ue.entity.Dato;
import co.edu.ue.service.IDatoService;
import java.util.List;


@RestController
public class DatoController {
	
	@Autowired
	IDatoService service;
	
	/*
	 * RESPONSEENTITY
	 */
	@PostMapping(value="dato-sav", produces=MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Dato>> postDato(@RequestBody Dato dato ){
		List<Dato> listDato = service.addDato(dato);
		return new ResponseEntity<List<Dato>>(listDato, HttpStatus.CREATED);
	}
	
	@GetMapping(value="dato-all", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Dato>> getAllDato(){
		//INCLUIR EN LA CABECERA LA CANTIDAD DE REGISTROS
		List<Dato> listDato = service.ListAll();
		//1.INSTANCIAMOS UN OBJETO DE TIPO HEADER PARA AGREGAR LA INFORMACION EN LA CABECERA
		HttpHeaders headers= new HttpHeaders();
		//2.AGREGAMOS LA INFORMACION CON EL METODO ADD
		headers.add("cantDatos", String.valueOf(listDato.size()));
		headers.add("test", "valor");
		return new ResponseEntity<List<Dato>>(listDato, headers, HttpStatus.OK);
	}
	
	@PutMapping(value ="dato-up")
	public ResponseEntity<Dato> putDato(@RequestBody Dato dato) {
		return new ResponseEntity<Dato>(service.upDato(dato), HttpStatus.ACCEPTED);
	}
	
	@GetMapping(value= "dato-id")
	public ResponseEntity<Dato> getIdDato (@RequestParam("id") int id) {
		return new ResponseEntity<Dato>(service.findIdDato(id), HttpStatus.OK);
	}	
	@GetMapping(value= "dato-email")
	public ResponseEntity<Dato> getByEmail(@RequestParam("email") String mail) {
		return new ResponseEntity<Dato>(service.findEmailDato(mail), HttpStatus.OK);
		
	}	
}
