package pruebasMaven.inicio;

import pruebasMaven.modelo.alumno.CreateAlumno;
import pruebasMaven.modelo.alumno.DeleteAlumno;
import pruebasMaven.modelo.asignatura.CreateAsignatura;
import pruebasMaven.modelo.profesor.CreateProfesor;
import pruebasMaven.negocio.AlumnoBean;
import pruebasMaven.negocio.AsignaturaBean;
import pruebasMaven.negocio.ProfesorBean;

public class Start {

	public static void main(String[] args) {
		//AsignaturaBean
		AsignaturaBean programacion = new AsignaturaBean();
		programacion.setNombre("Programacion");
		
		AsignaturaBean ingles = new AsignaturaBean();
		ingles.setNombre("Inglés");

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
		pepe.setCiudad("Gijón");
		//pepe.setAsignatura(ingles);
		
		AlumnoBean alberto = new AlumnoBean();
		alberto.setNombre("Alberto");
		alberto.setTelefono("09876543");
		alberto.setCiudad("Lugones");
		alberto.setAsignatura(ingles);	//Importa el orden del codigo a la hora de pasarle la asignatura,rn rdter caso "programacion"????
		
		
		
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
		
	}
}
