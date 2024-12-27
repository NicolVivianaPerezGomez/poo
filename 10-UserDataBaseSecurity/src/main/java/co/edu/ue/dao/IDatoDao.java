package co.edu.ue.dao;

import java.util.List;

import co.edu.ue.entity.Dato;

public interface IDatoDao {
	//Declaraciones de métodos abstractos o constantes
		List<Dato> guardarDatos(Dato dato);
		Dato actualizarDato(Dato dato);
		//Consultas 
		List<Dato> listCompleta();
		Dato busquedaPorId(int id);
		Dato busquedaPorEmail(String email);
}
