package patronesCreacionalesEstructurales.adapter;

public class Ejecutable {

	public static void main(String[] args) {
		VideoVHS reproductorVHS = new VideoVHS();
		CintaBeta peliBeta = new CintaBeta();
		CintaVHS peliVHS = new CintaVHS();
		
		AdaptadorBetaAVHS adaptadorVHS = new AdaptadorBetaAVHS(peliBeta);
		
		reproductorVHS.setCinta(adaptadorVHS);
		reproductorVHS.reproducirPelicula();
	}

}
