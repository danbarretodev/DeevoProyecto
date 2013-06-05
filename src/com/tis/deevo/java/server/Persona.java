package com.tis.deevo.java.server;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "PERSONA")
public class Persona implements Serializable {

	private static final long serialVersionUID = -8862996895049502867L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String per_dni;
	
	private String per_nom;
	private Integer per_telf;
	@Temporal(TemporalType.DATE)
	private Date per_nac;
	
	private Integer per_cel;
	private String per_estc;
	private String per_email;
	private String per_dir;
	private Integer per_can;


	public Persona() {
	}

	public void setPer_dni(String per_dni) {
		this.per_dni = per_dni;
	}

	public void setPer_nom(String per_nom) {
		this.per_nom = per_nom;
	}

	public void setPer_telf(Integer per_telf) {
		this.per_telf = per_telf;
	}

	public void setPer_nac(Date per_nac) {
		this.per_nac = per_nac;
	}

	public void setPer_cel(Integer per_cel) {
		this.per_cel = per_cel;
	}

	public void setPer_estc(String per_estc) {
		this.per_estc = per_estc;
	}

	public void setPer_email(String per_email) {
		this.per_email = per_email;
	}

	public void setPer_dir(String per_dir) {
		this.per_dir = per_dir;
	}

	public void setPer_can(Integer per_can) {
		this.per_can = per_can;
	}

	public String getPer_dni() {
		return per_dni;
	}

	public String getPer_nom() {
		return per_nom;
	}

	public Integer getPer_telf() {
		return per_telf;
	}

	public Date getPer_nac() {
		return per_nac;
	}

	public Integer getPer_cel() {
		return per_cel;
	}

	public String getPer_estc() {
		return per_estc;
	}

	public String getPer_email() {
		return per_email;
	}

	public String getPer_dir() {
		return per_dir;
	}

	public Integer getPer_can() {
		return per_can;
	}
}
