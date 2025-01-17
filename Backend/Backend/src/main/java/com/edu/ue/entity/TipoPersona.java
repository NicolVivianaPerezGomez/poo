package com.edu.ue.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;


/**
 * The persistent class for the tipo_personas database table.
 * 
 */
@Entity
@Table(name="tipo_personas")
@NamedQuery(name="TipoPersona.findAll", query="SELECT t FROM TipoPersona t")
public class TipoPersona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_tp")
	private int idTp;

	@Column(name="nombre_tp")
	private String nombreTp;

	//bi-directional many-to-one association to Persona
	@OneToMany(mappedBy="tipoPersona")
	private List<Persona> personas;

	public TipoPersona() {
	}

	public int getIdTp() {
		return this.idTp;
	}

	public void setIdTp(int idTp) {
		this.idTp = idTp;
	}

	public String getNombreTp() {
		return this.nombreTp;
	}

	public void setNombreTp(String nombreTp) {
		this.nombreTp = nombreTp;
	}

	public List<Persona> getPersonas() {
		return this.personas;
	}

	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}

	public Persona addPersona(Persona persona) {
		getPersonas().add(persona);
		persona.setTipoPersona(this);

		return persona;
	}

	public Persona removePersona(Persona persona) {
		getPersonas().remove(persona);
		persona.setTipoPersona(null);

		return persona;
	}

}