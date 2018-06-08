package patronesCreacionalesEstructurales.bridge;

public abstract class Vehiculo {
	protected Motor motor0;
	
	public void setMotor(Motor _motor) {
		this.motor0 = _motor;
	}
	
	public Motor getMotor() {
		return this.motor0;
	}
}
