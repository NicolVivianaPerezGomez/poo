package co.edu.ue.dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.ue.entity.Dato;
import co.edu.ue.jpa.IDatoJpa;

@Repository
public class DatoDao implements IDatoDao {
	
	//Inyección por interface de Jpa
	
	@Autowired
	IDatoJpa jpa;

	@Override
	public List<Dato> guardarDatos(Dato dato) {
		jpa.save(dato);
		return listCompleta();
	}

	@Override
	public Dato actualizarDato(Dato dato) {
		return jpa.save(dato);
	}

	@Override
	public List<Dato> listCompleta() {
		return jpa.findAll();
	}

	@Override
	public Dato busquedaPorId(int id) {
		return jpa.findById(id).orElse(null);
	}

	@Override
	public Dato busquedaPorEmail(String email) {
		return jpa.findByDatEmail(email);
	}
	
}
