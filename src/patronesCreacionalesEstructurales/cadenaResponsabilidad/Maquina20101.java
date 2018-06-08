package patronesCreacionalesEstructurales.cadenaResponsabilidad;

public class Maquina20101 {
	private MaquinaDispensadora dispensador20;
	
	public Maquina20101() {
		this.dispensador20 = new Dispensador20L();
		MaquinaDispensadora dispensador10L = new Dispensador10L();
		MaquinaDispensadora dispensador1L = new Dispensador1L();
		
		this.dispensador20.siguienteEslabon(dispensador10L);
		
		dispensador10L.siguienteEslabon(dispensador1L);
	}
	
	public void servirLeche(int cantidad) {
		this.dispensador20.servirLeche(cantidad);
	}
}
