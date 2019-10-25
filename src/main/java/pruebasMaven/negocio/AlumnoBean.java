package pruebasMaven.negocio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="alumno")
public class AlumnoBean {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private long id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="telefono")//Esto es reudndante ya que java le asigna el nombre del objeto por defecto, seria solo en el caso de querer cambiar el nombre
	private String telefono;
	
	@Column(name="ciudad")
	private String ciudad;
	
	/*Esto es una clase y hay que saber la relacion, 
	 *en este caso hay una relacion de de muchos alumnos
	 *a una asignatura */
	/*
	@ManyToOne
	@JoinColumn(name = "FK_asignatura") // Esto que te vas a encontrar aqui va a estar en otra tabla y el vinculo que tienen lo vas a guardar en una columna a la cual le vamos a dar el nombre 
	private AsignaturaBean asignatura;
	*/
	
	/*La relacion pasa de ser ManyToOne a ManyToMany*/
	@ManyToMany
	private List<AsignaturaBean> asignaturas 
	
	
	
	public AsignaturaBean getAsignatura() {
		return asignatura;
	}
	
	/*
	public void setAsignatura(AsignaturaBean asignatura) {
		this.asignatura = asignatura;
	
	 * public void addAlumno(AlumnoBean alumno) {
		if(!alumnos.contains)
	}
	}
	*/
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

}
