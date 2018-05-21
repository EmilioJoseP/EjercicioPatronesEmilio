package ejercicioPatrones;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class LectorFicherosSingleton {
	private static LectorFicherosSingleton instancia;
	private FileInputStream fichero;
	private BufferedReader lector;

	private LectorFicherosSingleton() {}
	
	public static LectorFicherosSingleton getInstancia() {
		if (instancia == null) {
			instancia = new LectorFicherosSingleton();
		}
		return instancia;
	}
	
	public ArrayList<String> leerFichero(String ruta) {
		ArrayList<String> lineas = new ArrayList<String>();
		String linea = "";
		
		try {
			
			this.fichero = new FileInputStream(ruta);
			this.lector = new BufferedReader(new InputStreamReader(this.fichero));
			while ((linea = this.lector.readLine()) != null) {
				lineas.add(linea);
			}
			
			this.fichero.close();
		} catch (FileNotFoundException e) {
			System.err.println("No se ha encontrado el fichero");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		return lineas;
	}
}
