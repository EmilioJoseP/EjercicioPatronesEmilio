package ejercicioPatrones;

public class Universidad extends CentroEstudios {
	private boolean regalaMaster;
	
	public Universidad(String _nombre, String _añoFundacion, String _localidad, String _ficheroAlumnos, boolean _regalaMaster) {
		super(_nombre, _añoFundacion, _localidad, _ficheroAlumnos);
		this.regalaMaster = _regalaMaster;
	}

	public boolean isRegalaMaster() {
		return this.regalaMaster;
	}

	public void setRegalaMaster(boolean regalaMaster) {
		this.regalaMaster = regalaMaster;
	}
}
