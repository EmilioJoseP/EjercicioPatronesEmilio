package patronesCreacionalesEstructurales.cadenaResponsabilidad;

public interface MaquinaDispensadora {
	
	public void siguienteEslabon(MaquinaDispensadora _siguiente);
	
	public void servirLeche(int cantidad);
}
