package patronesCreacionalesEstructurales.cadenaResponsabilidad;

public class Dispensador20L implements MaquinaDispensadora {

	private MaquinaDispensadora siguiente;
	int litrosRestantes = 1;
	
	@Override
	public void siguienteEslabon(MaquinaDispensadora _siguiente) {
		this.siguiente = _siguiente;

	}

	@Override
	public void servirLeche(int cantidad) {
		if (cantidad >= 20) {
			do {
				cantidad = cantidad - 20;
				System.out.println("Servidos los 20 litros");
			} while (cantidad >= 20);
		}
		
		if (cantidad != 0) {
			this.siguiente.servirLeche(cantidad);
		}
	}

}
