package org.maatalla.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Etudiant implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long idetudiant;
	@NotNull
	@Size(min=2, max=15)
	private String nom;
	@NotNull
	@Size(min=2, max=15)
	private String prenom;
	private Date datenaissance;
	public Long getIdetudiant() {
		return idetudiant;
	}
	public void setIdetudiant(Long idetudiant) {
		this.idetudiant = idetudiant;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDatenaissance() {
		return datenaissance;
	}
	public void setDatenaissance(Date datenaissance) {
		this.datenaissance = datenaissance;
	}
	public Etudiant(String nom, String prenom, Date datenaissance) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.datenaissance = datenaissance;
	}
	public Etudiant() {
		super();
	}
	
}
