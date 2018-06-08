package patronesCreacionalesEstructurales.bridge;

public class MotorCoche implements Motor {
	
	@Override
	public void meterMotor() {
		System.out.println("Metiendo motor de coche");
	}
}
