package fr.diginamic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class biblioJpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Recensement");
		EntityManager em = factory.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		
//		Livre livre = new Livre();
//		livre.setId(1);
//		livre.setTitre("machin");
//		livre.setAuteur("truc");
//		em.persist(livre);
//		transaction.commit();
		
		Livre livre1 = em.find(Livre.class,1);
		System.out.println(livre1.getAuteur());
//		Livre l = em.find(Livre.class, 4);
//		livre1.setTitre("supertruc");
//		em.remove(l);
//		em.persist(livre1);
//		transaction.commit();
		
//		Livre livre2 = em.find(Livre.class, 1);
//		livre.setTitre("machinmachin");
//		em.persist(livre2);
//		transaction.commit();
//		
//		Livre livre3 = em.find(Livre.class, livre2.getId());
//		System.out.println(livre3.getTitre());
		
//		for (Emprunt emp: livre.getEmprunts()) {
//		System.out.println(emp);
//		}

	}

}
