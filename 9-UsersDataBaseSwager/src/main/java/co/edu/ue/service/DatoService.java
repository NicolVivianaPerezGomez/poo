package co.edu.ue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ue.dao.IDatoDao;
import co.edu.ue.entity.Dato;

@Service
public class DatoService implements IDatoService {
	
	@Autowired
	IDatoDao dao;

	@Override
	public List<Dato> addDato(Dato dato) {
		return dao.guardarDatos(dato);
	}

	@Override
	public Dato upDato(Dato dato) {
		int id= dato.getDatId();
		if (!findIdDato(id).equals(null)) {
			return dao.actualizarDato(dato);	
		}
		return null;
	}

	@Override
	public List<Dato> ListAll() {
		return dao.listCompleta();
	}

	@Override
	public Dato findIdDato(int id) {
		return dao.busquedaPorId(id);
	}

	@Override
	public Dato findEmailDato(String email) {
		return dao.busquedaPorEmail(email);
	}
	
}
