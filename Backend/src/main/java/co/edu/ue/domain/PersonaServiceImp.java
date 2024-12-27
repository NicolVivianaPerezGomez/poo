package co.edu.ue.domain;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.edu.ue.entity.Persona;

@Service
public class PersonaServiceImp implements PersonaService {

	@Autowired
	private PersonaDaoI repositorio;
	
	@Override
	public List<Persona> listar() {
		// TODO Auto-generated method stub
		return repositorio.findAllPersona();
	}

	@Override
	public Persona listarId(int id) {
		// TODO Auto-generated method stub
		return repositorio.findByIdPersona(id);
	}

	@Override
	public Persona add(Persona p) {
		// TODO Auto-generated method stub
		return repositorio.savePersona(p);
	}

	@Override
	public Persona edit(Persona p) {
		// TODO Auto-generated method stub
		return repositorio.savePersona(p);
	}

	@Override
	public void delete(Persona p) {
		// TODO Auto-generated method stub
		repositorio.deletePersona(p);;
	}

}
