package co.edu.ue.domain;

import java.util.List;

import com.edu.ue.entity.Persona;

public interface PersonaService {

	List<Persona> listar();
	 Persona listarId(int id);
	 Persona add(Persona p);
	 Persona edit(Persona p);
	 void delete(Persona p);
	 
}
