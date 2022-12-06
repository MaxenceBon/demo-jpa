package fr.diginamic;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "villes")

public class Ville {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "NOM", length = 100, nullable = false, unique = false)
	private String nom;

	@Column(name = "CODE_POSTAL", length = 50, nullable = false, unique = false)
	private Integer codePostal;

	@Column(name = "DERNIER_RECENSEMENT", length = 50, nullable = false, unique = false)
	private Date dateDernierRecensement;

	@Column(name = "CATEGORIE", length = 50, nullable = true, unique = false)
	@Enumerated(EnumType.STRING)
	private Categorie categorie;

	public Ville() {

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

	/** Getter pour categorie
	 * @return the categorie
	 */
	public Categorie getCategorie() {
		return categorie;
	}

	/** Setter pour categorie
	 * @param categorie the categorie to set
	 */
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	
	
}
