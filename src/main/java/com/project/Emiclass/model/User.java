package com.project.Emiclass.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown =true)
@Entity
@Table(name="Eleve")
public class User {
	@Id
	@GeneratedValue
	private int matricule;
	
	private String prenom;
	private String nom;
	private String genie;
	
	
	public User() {
		super();
	}
	
	public User(int matricule, String prenom, String nom, String genie) {
		super();
		this.matricule = matricule;
		this.prenom = prenom;
		this.nom = nom;
		this.genie = genie;
	}
	public int getMatricule() {
		return matricule;
	}
	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getGenie() {
		return genie;
	}
	public void setGenie(String genie) {
		this.genie = genie;
	}
	
	
	
}
