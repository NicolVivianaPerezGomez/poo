package co.edu.ue.service;

import java.util.List;

import co.edu.ue.entity.Dato;

public interface IDatoService {
	//Declaraciones de métodos abstractos o constantes
	List<Dato> addDato(Dato dato);
	Dato upDato(Dato dato);
	//Consultas 
	List<Dato> ListAll();
	Dato findIdDato(int id);
	Dato findEmailDato(String email);
	}

