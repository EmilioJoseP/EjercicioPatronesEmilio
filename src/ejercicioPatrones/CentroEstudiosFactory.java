package ejercicioPatrones;

public class CentroEstudiosFactory {
	
	public static CentroEstudios crearCentro(int _tipoCentro, String _nombre, String _añoFundacion,
			String _localidad, String _ficheroAlumnos, boolean _regalaMaster, boolean _tieneMedio, boolean _tieneSuperior) {
		if (_tipoCentro == 1) {
			return new Universidad(_nombre, _añoFundacion, _localidad, _ficheroAlumnos, _regalaMaster);
		} else if (_tipoCentro == 2) {
			return new Instituto(_nombre, _añoFundacion, _localidad, _ficheroAlumnos, _tieneMedio, _tieneSuperior);
		}
		
		return null;
	}
}
