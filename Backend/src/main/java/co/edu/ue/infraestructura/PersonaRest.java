package co.edu.ue.infraestructura;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.ue.entity.Persona;

import co.edu.ue.domain.PersonaService;

@RestController
public class PersonaRest {

	@Autowired
	 PersonaService service;
	
	@GetMapping("/persona")
	public List<Persona> getAllPerson() {
		return service.listar();
	}
	
	
	
}
