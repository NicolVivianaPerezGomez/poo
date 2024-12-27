package co.edu.ue.dao;

import java.util.List;

import com.edu.ue.entity.Dato;

public interface IDatoDao {

	//DECLARACION DE METODOS ABSTRACTOS O QUE NO TIENEN CUERPO O CONSTANTES
	
	List<Dato> guardarDato(Dato dato);
	Dato actualizarDato(Dato dato);
	
	
	//CONSULTAS
	List <Dato> listaCompleta();
	Dato busquedaPorId(int id);
	Dato busquedaPorEmail(String email);
	
}
