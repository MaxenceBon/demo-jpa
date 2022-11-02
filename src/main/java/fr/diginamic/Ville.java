package fr.diginamic;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Generated;

public class Ville {

	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name = "nom", length = 100,nullable = false, unique = false)
	String nom;
	
	@Column(name = "code postal",nullable = false, unique = false)
	int codePostal;
	
	@Column(name = "dernier_recensement",nullable = false, unique = false)
	Date dateDernierRecensement;
	
	@Column(name = "categorie",nullable = true, unique = false)
	Categorie categorie;

	
}
