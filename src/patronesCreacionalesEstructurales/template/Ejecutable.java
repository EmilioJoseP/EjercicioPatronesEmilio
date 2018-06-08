package patronesCreacionalesEstructurales.template;

public class Ejecutable {

	public static void main(String[] args) {
		PlantillaTortilla normal = new TortillaPatatasNormal();
		normal.cocinar();
		System.out.println("--------------------");
		
		PlantillaTortilla conCebolla = new TortillaConCebolla();
		conCebolla.cocinar();
		System.out.println("--------------------");
		
		PlantillaTortilla suda = new TortillaSuda();
		suda.cocinar();
		System.out.println("--------------------");
	}

}
