package co.edu.ue.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edu.ue.entity.Dato;

import co.edu.ue.jpa.IDatoJpa;


@Repository
public class DatoDao implements IDatoDao { //HACE CONEXION A LA BASE DE DATOS

	//INYECCION POR INTERFACE DE JPA
	
	@Autowired
	IDatoJpa jpa;
	
	@Override
	public List<Dato> guardarDato(Dato dato) {
		jpa.save(dato);
		return listaCompleta();
	}

	@Override
	public Dato actualizarDato(Dato dato) {
		return jpa.save(dato);
	}

	@Override
	public List<Dato> listaCompleta() {
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
