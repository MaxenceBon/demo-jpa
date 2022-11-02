package fr.diginamic;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Ville {

	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name = "NOM", length = 100,nullable = false, unique = false)
	String nom;
	
	@Column(name = "CODE-POSTAL",nullable = false, unique = false)
	int codePostal;
	
	@Column(name = "DERNIER-RECENSEMENT",nullable = false, unique = false)
	Date dateDernierRecensement;
	
	@Column(name = "CATEGORIE",nullable = true, unique = false)
	Categorie categorie;

	/** Getter pour id
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/** Setter pour id
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/** Getter pour nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter pour nom
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter pour codePostal
	 * @return the codePostal
	 */
	public int getCodePostal() {
		return codePostal;
	}

	/** Setter pour codePostal
	 * @param codePostal the codePostal to set
	 */
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	/** Getter pour dateDernierRecensement
	 * @return the dateDernierRecensement
	 */
	public Date getDateDernierRecensement() {
		return dateDernierRecensement;
	}

	/** Setter pour dateDernierRecensement
	 * @param dateDernierRecensement the dateDernierRecensement to set
	 */
	public void setDateDernierRecensement(Date dateDernierRecensement) {
		this.dateDernierRecensement = dateDernierRecensement;
	}

	
	
	
}
