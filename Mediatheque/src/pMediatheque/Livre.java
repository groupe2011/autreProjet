package pMediatheque;

public class Livre extends Media{
	private int nbPage;
	
	public Livre(int code, String type, int nbPage) {
		// TODO Auto-generated constructor stub
		super(code,type);
		this.nbPage = nbPage;
	}
	public int getNbPage() {
		return nbPage;
	}

	public void setNbPage(int nbPage) {
		this.nbPage = nbPage;
	}
}
Meryem a modifié
