package patronesCreacionalesEstructurales.cadenaResponsabilidad;

public class Dispensador1L implements MaquinaDispensadora {
	private MaquinaDispensadora siguiente;
	
	@Override
	public void siguienteEslabon(MaquinaDispensadora _siguiente) {
		this.siguiente = _siguiente;

	}

	@Override
	public void servirLeche(int cantidad) {
		if (cantidad >= 1) {
			do {
				cantidad = cantidad - 1;
				System.out.println("Servidos los 1 litro");
			} while (cantidad >= 1);
		}
		
		if (cantidad != 0) {
			this.siguiente.servirLeche(cantidad);
		}
	}
}
