package ejercicioPatrones;

public class Persona {
	private String nombre;
	private String apellidos;
	private int añoNacimiento;
	private String ciudad;
	private String telefono;
	
	public Persona(PersonaBuilder personaBuilder) {
		this.nombre = personaBuilder.getNombre();
		this.apellidos = personaBuilder.getApellidos();
		this.añoNacimiento = personaBuilder.getAñoNacimiento();
		this.ciudad = personaBuilder.getCiudad();
		this.telefono = personaBuilder.getTelefono();
	}
	
	public String toString() {
		String paraDevolver = "";
		
		if (this.nombre != null) {
			paraDevolver += this.nombre + " ";
		} 
		
		if (this.apellidos != null) {
			paraDevolver += this.apellidos + " ";
		} 
		
 		if (this.añoNacimiento != 0) {
			paraDevolver += this.añoNacimiento + " ";
		}
 		
 		if (this.ciudad != null) {
			paraDevolver += this.ciudad + " ";
		}

 		if (this.telefono != null) {
			paraDevolver += this.telefono + " ";
		}
		
		return paraDevolver;
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
