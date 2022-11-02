package fr.diginamic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import java.util.Date;

public class InsertionVilleJpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("villes");
		EntityManager em = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		
		Ville nantes = new Ville(1, "Nantes", 44000, new Date() , Categorie.GRANDE);
		Ville stNazaire = new Ville(2, "Saint Nazaire", 44100, new Date() , Categorie.MOYENNE);
		
		em.persist(nantes);
		em.persist(stNazaire);
		
		transaction.commit();
		
		
	}

}
