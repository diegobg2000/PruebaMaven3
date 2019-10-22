package pruebasMaven.modelo.alumno;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import pruebasMaven.negocio.AlumnoBean;

public class DeleteAlumno {
	
		
	public void delete(AlumnoBean alumno) {
		//De donde sale alumnoBorrar???
		//Utilidad del Entity Manger??
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.diego.pruebasMaven.H2");
		EntityManager entityManager = emf.createEntityManager();
		
		//Saca de la clase alumno bean el ID del alumno
		entityManager.getTransaction().begin();
		AlumnoBean alumnoBorrar = entityManager.find(AlumnoBean.class, alumno.getId());
		if(alumnoBorrar!=null) {
			
			//Si encuentra coincidencia con el id que le estamos pasando que lo elimine
			entityManager.remove(alumnoBorrar);
		}
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}