package patronesCreacionalesEstructurales.adapter;

public class AdaptadorBetaAVHS implements VHS {

	private CintaBeta cinta;
	
	public AdaptadorBetaAVHS(CintaBeta _cinta) {
		this.cinta = _cinta;
	}
	
	@Override
	public void reproducirCintaVHS() {
		this.cinta.reproducirBeta();
	}

}
