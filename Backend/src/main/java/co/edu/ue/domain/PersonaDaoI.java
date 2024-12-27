package co.edu.ue.domain;

import java.util.List;

import com.edu.ue.entity.Persona;

public interface PersonaDaoI {
	
	List<Persona> findAllPersona();
	 Persona findByIdPersona(int id);
	 Persona savePersona(Persona p);
	 void deletePersona(Persona p);

}
