package fr.diginamic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "regions")

public class Region {

@Id
private Integer id;

@Column (name = "nom", length = 20)
private String nom;

public Region() {
	
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
	


	
}
