package pruebasMaven.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
//Esta clase creo que es la unidad de pesistencia singleton
public class Connection {

		private static EntityManager entityManager = null;
		
		private Connection() {
			
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.marcos.pruebasMaven.H2");
			entityManager = emf.createEntityManager();
		}
		
		
		public static EntityManager getEntityManager() {
			
			if(entityManager==null) {
				
				new Connection();
			}
			return entityManager;
		}
	}
