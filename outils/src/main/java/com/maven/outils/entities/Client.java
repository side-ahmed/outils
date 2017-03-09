package com.maven.outils.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "client")

public class Client {
	
	
	

	  @Id
	  @GeneratedValue

	  private Integer id;
	 

	  public Integer getId() {

	    return id;

	  }
	  public void setId(Integer id) {

		    this.id = id;

		  }
	  private String nom;

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

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	private String prenom;

	  private String ville;

	  private String adresse;

	  private String tel;

	

}
