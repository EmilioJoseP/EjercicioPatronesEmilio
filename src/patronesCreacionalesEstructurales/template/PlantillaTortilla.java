package patronesCreacionalesEstructurales.template;

public abstract class PlantillaTortilla {
	
	public final void cocinar() {
		System.out.println(this.paso1());
		System.out.println(this.paso2());
		System.out.println(this.paso3());
		System.out.println(this.paso4());
		System.out.println(this.paso5());
		System.out.println(this.paso6());
	}
	
	public String paso1() {
		return "Se pelan las patatas";
	}

	public String paso2() {
		return "Se cortan las patatas";
	}
	
	public String paso3() {
		return "No añadimos otros elementos";
	}
	
	public String paso4() {
		return "Se frien los ingredientes";
	}
	
	public String paso5() {
		return "Se mezcla con huevo";
	}
	
	public String paso6() {
		return "Cocinando 3 minutos";
	}
}
