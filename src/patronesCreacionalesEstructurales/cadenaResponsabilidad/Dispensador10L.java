package patronesCreacionalesEstructurales.cadenaResponsabilidad;

public class Dispensador10L implements MaquinaDispensadora {
	private MaquinaDispensadora siguiente;
	
	@Override
	public void siguienteEslabon(MaquinaDispensadora _siguiente) {
		this.siguiente = _siguiente;

	}

	@Override
	public void servirLeche(int cantidad) {
		if (cantidad >= 10) {
			do {
				cantidad = cantidad - 10;
				System.out.println("Servidos los 10 litros");
			} while (cantidad >= 10);
		}
		
		if (cantidad != 0) {
			this.siguiente.servirLeche(cantidad);
		}
	}
}
