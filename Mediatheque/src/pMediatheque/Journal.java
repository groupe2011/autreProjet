package pMediatheque;

// et oui sa marche ^_^
public class Journal extends Media{
	private String periodicite;

	public Journal(int code, String type, String periodicite) {
		// TODO Auto-generated constructor stub
		super(code, type);
		this.periodicite = periodicite;
	}
	public String getPeriodicite() {
		return periodicite;
	}

	public void setPeriodicite(String periodicite) {
		this.periodicite = periodicite;
	}
}
