package patronesCreacionalesEstructurales.bridge;

public class Ejecutable {
	public static void main(String[] args) {
		Vehiculo coche0 = new Coche();
		
		MotorCoche motor0 = new MotorCoche();
		
		coche0.setMotor(motor0);
		
		coche0.getMotor().meterMotor();
	}
}
