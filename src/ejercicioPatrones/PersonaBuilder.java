package ejercicioPatrones;

public class PersonaBuilder {
	private String nombre;
	private String apellidos;
	private int añoNacimiento;
	private String ciudad;
	private String telefono;
	
	public PersonaBuilder() {}
	
	public Persona build() {
		return new Persona(this);
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getAñoNacimiento() {
		return this.añoNacimiento;
	}

	public void setAñoNacimiento(int añoNacimiento) {
		this.añoNacimiento = añoNacimiento;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
}
