package pruebasMaven.inicio;

import pruebasMaven.modelo.alumno.CreateAlumno;
import pruebasMaven.modelo.alumno.DeleteAlumno;
import pruebasMaven.modelo.asignatura.CreateAsignatura;
import pruebasMaven.modelo.profesor.CreateProfesor;
import pruebasMaven.negocio.AlumnoBean;
import pruebasMaven.negocio.AsignaturaBean;
import pruebasMaven.negocio.ProfesorBean;
import pruebasMaven.util.Connection;

public class Start {

	public static void main(String[] args) {
		/*
		
		//AsignaturaBean
		AsignaturaBean programacion = new AsignaturaBean();
		programacion.setNombre("Programacion");
		
		AsignaturaBean ingles = new AsignaturaBean();
		ingles.setNombre("Ingl�s");

		AsignaturaBean frances = new AsignaturaBean();
		frances.setNombre("Frances");
		
		AsignaturaBean mates = new AsignaturaBean();
		mates.setNombre("Mates");
		
		//Create Asignatura
		CreateAsignatura createAsignatura = new CreateAsignatura();
		createAsignatura.create(programacion);
		createAsignatura.create(ingles);
		createAsignatura.create(frances);
		createAsignatura.create(mates);
		
		ProfesorBean javier = new ProfesorBean();
		javier.setNombre("Javier");
		javier.setDni("123456789B");
		
		CreateProfesor createProfesor = new CreateProfesor();
		createProfesor.create(javier);
		
		//AlumnosBean
		AlumnoBean diego = new AlumnoBean();
		diego.setNombre("Diego");
		diego.setTelefono("123456789");
		diego.setCiudad("Oviedo");
		//diego.setAsignatura(programacion);
		
		AlumnoBean pepe = new AlumnoBean();
		pepe.setNombre("Pepe");
		pepe.setTelefono("676545678");
		pepe.setCiudad("Gijon");
		//pepe.setAsignatura(ingles);
		
		AlumnoBean alberto = new AlumnoBean();
		alberto.setNombre("Alberto");
		alberto.setTelefono("09876543");
		alberto.setCiudad("Lugones");
		//alberto.setAsignatura(ingles);	//Importa el orden del codigo a la hora de pasarle la asignatura,rn rdter caso "programacion"????
		
		
		
		//CreateAlumno
		CreateAlumno createAlumno = new CreateAlumno();
		createAlumno.create(diego);
		createAlumno.create(pepe);

		
		//DeleteAlumno
		/*
		AlumnoBean marcos = new AlumnoBean();
		pepe.setId(8);
		
		DeleteAlumno delete = new DeleteAlumno();
		delete.delete(pepe);
		*/
		
		
		
		
		
		
		
		/*CONTENIDO DEL START DE MARCOS********************************************************************************/

		
		
		
		
		
		/*CONTENIDO DEL START DE MARCOS********************************************************************************/

		AsignaturaBean lengua = new AsignaturaBean();
		lengua.setNombre("lengua");
		
		AsignaturaBean historia = new AsignaturaBean();
		historia.setNombre("historia");
		
		AsignaturaBean filosofia = new AsignaturaBean();
		filosofia.setNombre("filosofia");

		AsignaturaBean mates = new AsignaturaBean();
		mates.setNombre("mates");
		

		
		
		
		AlumnoBean maria = new AlumnoBean();
		maria.setNombre("Maria");
		maria.setCiudad("Oviedo");
		maria.setTelefono("666555444");
		
		AlumnoBean marcos = new AlumnoBean();
		marcos.setNombre("Marcos");
		marcos.setCiudad("Oviedo");
		marcos.setTelefono("666555444");

		
		filosofia.addAlumno(marcos);
		filosofia.addAlumno(maria);
		
		
		CreateAsignatura createAsignatura = new CreateAsignatura();
		createAsignatura.create(lengua);
		createAsignatura.create(mates);
		createAsignatura.create(historia);
		createAsignatura.create(filosofia);
		
		
		CreateAlumno createAlumno = new CreateAlumno();
		createAlumno.create(marcos);
		createAlumno.create(maria);

		
		AsignaturaBean nueva = Connection.getEntityManager().find(AsignaturaBean.class, 4L);
		System.out.println(nueva);
		
		Connection.getEntityManager().close();
	}
}
