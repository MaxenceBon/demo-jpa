package fr.diginamic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import java.util.Date;

public class InsertionVilleJpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Recensement");
		EntityManager villeManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = villeManager.getTransaction();
		transaction.begin();
		
		Ville nantes = new Ville();
		nantes.setNom("Nantes");
//		nantes.setId(3);
		nantes.setCodePostal(44000);
		nantes.setDateDernierRecensement(new Date());
		nantes.setCategorie(Categorie.GRANDE);
		Ville stNazaire = new Ville("Saint Nazaire", 44100, new Date() , Categorie.MOYENNE);
		
		villeManager.persist(stNazaire);
//		em.persist(stNazaire);
		
		transaction.commit();
		
		
	}

}
