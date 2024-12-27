package com.edu.ue.entity;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the personas database table.
 * 
 */
@Entity
@Table(name="personas")
@NamedQuery(name="Persona.findAll", query="SELECT p FROM Persona p")
public class Persona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_p")
	private int idP;

	@Column(name="apellidos_")
	private String apellidos;

	@Column(name="nombres_p")
	private String nombresP;

	//bi-directional many-to-one association to TipoPersona
	@ManyToOne
	@JoinColumn(name="id_tp")
	private TipoPersona tipoPersona;

	public Persona() {
	}

	public int getIdP() {
		return this.idP;
	}

	public void setIdP(int idP) {
		this.idP = idP;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombresP() {
		return this.nombresP;
	}

	public void setNombresP(String nombresP) {
		this.nombresP = nombresP;
	}

	public TipoPersona getTipoPersona() {
		return this.tipoPersona;
	}

	public void setTipoPersona(TipoPersona tipoPersona) {
		this.tipoPersona = tipoPersona;
	}

}