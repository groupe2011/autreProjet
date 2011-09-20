package pMediatheque;

public class Media implements Comparable<Media>{
	private int code;
	private String type;
	
	public Media(int code, String type) {
		// TODO Auto-generated constructor stub
		this.code = code;
		this.type =  type;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public int compareTo(Media o) {
		// TODO Auto-generated method stub
		return (this.type.compareTo(o.type));
	}
}
