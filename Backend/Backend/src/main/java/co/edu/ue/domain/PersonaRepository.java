package co.edu.ue.domain;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.edu.ue.entity.Persona;


public interface PersonaRepository extends JpaRepository<Persona, Integer> {
	
	List<Persona> findAll();
	 Persona findById(int id);
	 Persona save(Persona p);
	 void delete(Persona p);
}

