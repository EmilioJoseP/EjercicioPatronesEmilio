package patronesCreacionalesEstructurales.adapter;

public class VideoVHS {
	private VHS cinta;

	public void setCinta(VHS cinta) {
		this.cinta = cinta;
	}
	
	public void reproducirPelicula() {
		this.cinta.reproducirCintaVHS();
	}
}
