package fr.diginamic;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "livre")

public class Livre {

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private Integer id;
	
	@Column(name="TITRE")
	private String titre;
	
	@Column(name="AUTEUR")
	private String auteur;
	
	
	@ManyToMany
	@JoinTable(name = "COMPO", 
				joinColumns = @JoinColumn(name= "ID_LIV", referencedColumnName = "ID"),
				inverseJoinColumns = @JoinColumn(name = "ID_EMP", referencedColumnName = "ID"))
	private List<Emprunt> emprunts = new ArrayList<Emprunt>();
	
	
	
	public Livre() {	
	}
	
	/** Getter pour id
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/** Setter pour id
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/** Getter pour titre
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}
	/** Setter pour titre
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}
	/** Getter pour auteur
	 * @return the auteur
	 */
	public String getAuteur() {
		return auteur;
	}
	/** Setter pour auteur
	 * @param auteur the auteur to set
	 */
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public Emprunt[] getEmprunts() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
