package co.edu.ue.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edu.ue.entity.Persona;

@Repository
public class PersonaRepositoryImp implements PersonaDaoI{
	
	@Autowired
	PersonaRepository repo;

	@Override
	public List<Persona> findAllPersona() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Persona findByIdPersona(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	@Override
	public Persona savePersona(Persona p) {
		// TODO Auto-generated method stub
		return repo.save(p);
	}

	@Override
	public void deletePersona(Persona p) {
		// TODO Auto-generated method stub
		repo.delete(p);
		
	}

	
}

	