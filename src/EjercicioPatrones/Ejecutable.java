package ejercicioPatrones;

import java.util.ArrayList;

public class Ejecutable {

	public static void main(String[] args) {
		ArrayList<CentroEstudios> arrayCentros = new ArrayList<CentroEstudios>();
		ArrayList<PersonaBuilder> arrayPersonasBuilder = new ArrayList<PersonaBuilder>();
		int contadorDeArrayCentros = 0;

		// lectura fichero
		LectorFicherosSingleton fichero = LectorFicherosSingleton.getInstancia();
		ArrayList<String> arrayCentrosEnFichero = fichero.leerFichero("centros.txt");
		ArrayList<String> arrayAlumnosEnFichero;

		for (String centro : arrayCentrosEnFichero) {
			String campo[] = centro.split("#");

			String tipoUni[] = campo[0].split(":");

			if (tipoUni[0].equals("Universidad")) {
				boolean regalaMaster = false;
				
				String nombreUni[] = campo[1].split(":");
				String añoUni[] = campo[2].split(":");
				String localidadUni[] = campo[3].split(":");
				String ficheroUni[] = campo[4].split(":");
				String regalaUni[] = campo[5].split(":");
				
				if (regalaUni[0] == "si") {
					regalaMaster = true;
				}

				arrayCentros.add(CentroEstudiosFactory.crearCentro(1, nombreUni[0], añoUni[0], localidadUni[0], ficheroUni[0],
						regalaMaster, false, false));
				
			} else if (tipoUni[0].equals("Instituto")) {
				boolean tieneMedio = false;
				boolean tieneSuperior = false;
				
				String nombreInsti[] = campo[1].split(":");
				String añoInsti[] = campo[2].split(":");
				String localidadInsti[] = campo[3].split(":");
				String ficheroInsti[] = campo[4].split(":");
				String medioInsti[] = campo[5].split(":");
				String superiorInsti[] = campo[6].split(":");

				if (medioInsti[0].equals("si")) {
					tieneMedio = true;
				}

				if (superiorInsti[0].equals("si")) {
					tieneSuperior = true;
				}

				arrayCentros.add(CentroEstudiosFactory.crearCentro(2, nombreInsti[0], añoInsti[0], localidadInsti[0], ficheroInsti[0], false,
						tieneMedio, tieneSuperior));
			}

			arrayAlumnosEnFichero = fichero.leerFichero(campo[4]);

			int contadorPersonas = 0;
			for (String alumno : arrayAlumnosEnFichero) {
				arrayPersonasBuilder.add(new PersonaBuilder());
				String campos[] = alumno.split("#");

				for (int i = 0; i < campos.length; i++) {
					String tipoDato[] = campos[i].split(":");

					if (tipoDato[0].equals("nombre")) {
						arrayPersonasBuilder.get(contadorPersonas).setNombre(tipoDato[1]);
					}

					if (tipoDato[0].equals("apellidos")) {
						arrayPersonasBuilder.get(contadorPersonas).setApellidos(tipoDato[1]);
					}

					if (tipoDato[0].equals("añoNacimiento")) {
						arrayPersonasBuilder.get(contadorPersonas).setAñoNacimiento(Integer.valueOf(tipoDato[1]));
					}

					if (tipoDato[0].equals("ciudad")) {
						arrayPersonasBuilder.get(contadorPersonas).setCiudad(tipoDato[1]);
					}

					if (tipoDato[0].equals("telefono")) {
						arrayPersonasBuilder.get(contadorPersonas).setTelefono(tipoDato[1]);
						;
					}
				}

				arrayCentros.get(contadorDeArrayCentros).añadirAlumnos(arrayPersonasBuilder.get(contadorPersonas).build());
				contadorPersonas++;
			}

			contadorDeArrayCentros++;
		}
		
		for (int i = 0; i < arrayCentros.size(); i++) {
			System.out.println(arrayCentros.get(i).toString());
		}

	}

}
