package patronesCreacionalesEstructurales.iterador;

public class Ejecutable {

	public static void main(String[] args) {
		MiPropioArray array = new MiPropioArray();
		
		array.añadir("Prueba0");
		System.out.println(array.toString());
		
		array.añadir("Prueba1");
		System.out.println(array.toString());
		
		array.añadir("Prueba2");
		System.out.println(array.toString());
		
		array.añadir("Prueba3");
		System.out.println(array.toString());
		
		array.eliminarElemento(0);
		System.out.println(array.toString());
		
		array.eliminarUltimo();
		System.out.println(array.toString());
	}

}
