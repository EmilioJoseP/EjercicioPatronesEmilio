package patronesCreacionalesEstructurales.iterador;

import java.util.ArrayList;

public class MiPropioArray {
	ArrayList<String> cadena;
	
	public MiPropioArray() {
		this.cadena = new ArrayList<String>();
	}
	
	public void añadir(String _cadena) {
		this.cadena.add(_cadena);
	}
	
	public void eliminarElemento(int _posicion) {
		this.cadena.remove(_posicion);
	}
	
	public void eliminarUltimo() {
		this.cadena.remove(this.cadena.size() - 1);
	}
	
	public String toString() {
		String todo = "";
		for (String cad : this.cadena) {
			todo += cad;
		}
		return todo;
	}
}
