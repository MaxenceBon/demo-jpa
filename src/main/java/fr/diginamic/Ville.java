package fr.diginamic;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "villes")

public class Ville {

	@Id
	private int id;

	@Column(name = "NOM", length = 100, nullable = false, unique = false)
	private String nom;

	@Column(name = "CODE-POSTAL", nullable = false, unique = false)
	private int codePostal;

	@Column(name = "DERNIER-RECENSEMENT", nullable = false, unique = false)
	private Date dateDernierRecensement;

	@Column(name = "CATEGORIE", nullable = true, unique = false)
	private Categorie categorie;

	public Ville(int id, String nom, int codePostal, Date dateDernierRecensement, Categorie categorie) {
		super();
		this.id = id;
		this.nom = nom;
		this.codePostal = codePostal;
		this.dateDernierRecensement = dateDernierRecensement;
		this.categorie = categorie;
	}

	/**
	 * Getter pour id
	 * 
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Setter pour id
	 * 
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Getter pour nom
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter pour nom
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter pour codePostal
	 * 
	 * @return the codePostal
	 */
	public int getCodePostal() {
		return codePostal;
	}

	/**
	 * Setter pour codePostal
	 * 
	 * @param codePostal the codePostal to set
	 */
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	/**
	 * Getter pour dateDernierRecensement
	 * 
	 * @return the dateDernierRecensement
	 */
	public Date getDateDernierRecensement() {
		return dateDernierRecensement;
	}

	/**
	 * Setter pour dateDernierRecensement
	 * 
	 * @param dateDernierRecensement the dateDernierRecensement to set
	 */
	public void setDateDernierRecensement(Date dateDernierRecensement) {
		this.dateDernierRecensement = dateDernierRecensement;
	}

}
