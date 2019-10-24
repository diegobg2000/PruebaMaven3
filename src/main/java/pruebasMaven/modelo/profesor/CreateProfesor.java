package pruebasMaven.modelo.profesor;

import javax.persistence.EntityManager;

import pruebasMaven.negocio.ProfesorBean;
import pruebasMaven.util.Connection;

public class CreateProfesor {

	
	public void create(ProfesorBean profesor) {
		
		//El singleton es Connection que sabe entrgar EEntyties manager unicos?...
		//EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.diego.pruebasMaven.H2");
		EntityManager entityManager = Connection.getEntityManager();
		//EntityManagerFactory emf = ConnectSYion.get();
		//	EntityManager entityManager = emf.createEntityManager();
	
		
		entityManager.getTransaction().begin();//Se necesita un entity manager y ahora cada vez quese ejecuta se crea uno
		entityManager.persist(profesor);//
		entityManager.getTransaction().commit();
		//Porque es ridiculo
		//entityManager.close();	
}

}
