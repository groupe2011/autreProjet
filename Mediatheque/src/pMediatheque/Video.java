package pMediatheque;

public class Video extends Media{
	private double duree;
	
	public Video(int code, String type,double duree){
		// TODO Auto-generated constructor stub
		super(code,type);
		this.duree =  duree;
	}
	
	public double getDuree() {
		return duree;
	}

	public void setDuree(double duree) {
		this.duree = duree;
	}
}
