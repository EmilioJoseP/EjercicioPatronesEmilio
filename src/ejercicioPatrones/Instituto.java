package ejercicioPatrones;

public class Instituto extends CentroEstudios {
	private boolean tieneCicloSuperor;
	private boolean tieneCicloMedio;
	
	public Instituto(String _nombre, String _añoFundacion, String _localidad, String _ficheroAlumnos, boolean _tieneCicloMedio, boolean _tieneCicloSuperior) {
		super(_nombre, _añoFundacion, _localidad, _ficheroAlumnos);
		this.tieneCicloMedio = _tieneCicloMedio;
		this.tieneCicloSuperor = _tieneCicloSuperior;
	}

	public boolean isTieneCicloSuperor() {
		return this.tieneCicloSuperor;
	}

	public void setTieneCicloSuperor(boolean tieneCicloSuperor) {
		this.tieneCicloSuperor = tieneCicloSuperor;
	}

	public boolean isTieneCicloMedio() {
		return this.tieneCicloMedio;
	}

	public void setTieneCicloMedio(boolean tieneCicloMedio) {
		this.tieneCicloMedio = tieneCicloMedio;
	}
	
	
}
