package fr.diginamic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class biblioJpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Recensement");
		EntityManager em = factory.createEntityManager();
		
		Livre livre = em.find(Livre.class,1);
		System.out.println(livre);
		
		for (Emprunt emp: livre.getEmprunts()) {
		System.out.println(emp);
		}
		

	}

}
