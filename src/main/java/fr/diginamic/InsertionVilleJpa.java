package fr.diginamic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertionVilleJpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Tp improvise");
		EntityManager em = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		
		Region r = new Region();
		r.setNom("Occitanie");
		r.setId(1);
		em.persist(r);
		
		transaction.commit();
		
		
	}

}
