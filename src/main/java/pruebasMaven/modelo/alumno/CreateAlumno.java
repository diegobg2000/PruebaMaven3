package pruebasMaven.modelo.alumno;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import pruebasMaven.negocio.AlumnoBean;
import pruebasMaven.util.Connection;

	public class CreateAlumno {
		
		
		public void create(AlumnoBean alumno) {
			
			
			//El singleton es Connection que sabe entrgar EEntyties manager unicos?...
			//EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.diego.pruebasMaven.H2");
			//	EntityManager entityManager = Singleton.getEntityManager();
			//EntityManagerFactory emf = ConnectSYion.get();
			//	EntityManager entityManager = emf.createEntityManager();
			EntityManager entityManager = Connection.getEntityManager();

			
			entityManager.getTransaction().begin();//Se necesita un entity manager y ahora cada vez quese ejecuta se crea uno
			entityManager.persist(alumno);//
			entityManager.getTransaction().commit();
			//Porque es ridiculo
			//entityManager.close();	
	}
}
