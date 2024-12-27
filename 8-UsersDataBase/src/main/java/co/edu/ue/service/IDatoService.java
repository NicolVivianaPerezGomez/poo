package co.edu.ue.service;

import java.util.List;

import com.edu.ue.entity.Dato;

public interface IDatoService {


	List<Dato> addDato(Dato dato);
	Dato upDato(Dato dato);
	
	
	//CONSULTAS
	List <Dato> listall();
	Dato findId(int id);
	Dato findEmail(String email);
	List<Dato> listAll();
	Dato findIdDato(int id);
	Dato findEmailDato(String email);
}


