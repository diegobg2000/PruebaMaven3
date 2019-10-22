package pruebasMaven.inicio;

import pruebasMaven.modelo.alumno.CreateAlumno;
import pruebasMaven.negocio.AlumnoBean;

public class Start {

	public static void main(String[] args) {
		AlumnoBean diego = new AlumnoBean();
		diego.setNombre("Diego");
		diego.setTelefono("123456789");
		diego.setCiudad("Oviedo");
	
		CreateAlumno createAlumno = new CreateAlumno();
		createAlumno.create(diego);
	}
}
