package pruebasMaven.negocio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="asignatura")
public class AsignaturaBean {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private long id;
	
	@Column
	private String nombre;
	
	/*Como en este lado hay una asignatura para muchos alumnos se indica con el @OneToMany */
	@OneToMany(mappedBy= "asignatura")//Le idicamos que se tiene que enganchar con el provate asignaturaBean de la clase AlumnoBean en este caso asignatua
	/*Busco que si yo tengo una asignatura pueda sacar todos los datod que hay en ella pero sin select que lo haga el todo*/
	private List<AlumnoBean> alumnos = new ArrayList<AlumnoBean>();

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
	
}
