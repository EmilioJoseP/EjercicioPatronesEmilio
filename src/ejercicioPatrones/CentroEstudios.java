package ejercicioPatrones;

import java.util.ArrayList;

public class CentroEstudios {
	private String nombre;
	private String añoFundacion;
	private String localidad;
	private String ficheroAlumnos;
	private ArrayList<Persona> alumnos;
	
	public CentroEstudios(String _nombre, String _añoFundacion, String _localidad, String _ficheroAlumnos) {
		this.nombre = _nombre;
		this.añoFundacion = _añoFundacion;
		this.localidad = _localidad;
		this.ficheroAlumnos = _ficheroAlumnos;
		this.alumnos = new ArrayList<Persona>();
	}
	
	public String toString() {
		String paraReturn = "";
		paraReturn += this.nombre + " ";
		paraReturn += this.añoFundacion + " ";
		paraReturn += this.localidad + " ";
		
		for (int i = 0; i < this.alumnos.size(); i++) {
			paraReturn += "\nAlumno " + i + " : ";
			paraReturn += this.alumnos.get(i).toString();
		}
		
		return paraReturn;
	}
	
	public void añadirAlumnos(Persona personaParaAñadir) {
		this.alumnos.add(personaParaAñadir); 
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAñoFundacion() {
		return this.añoFundacion;
	}

	public void setAñoFundacion(String añoFundacion) {
		this.añoFundacion = añoFundacion;
	}

	public String getLocalidad() {
		return this.localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getFicheroAlumnos() {
		return this.ficheroAlumnos;
	}

	public void setFicheroAlumnos(String ficheroAlumnos) {
		this.ficheroAlumnos = ficheroAlumnos;
	}
	
	
}
