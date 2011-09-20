package pMediatheque;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Librairie  {
	
	private List<Media> liste;
	public Librairie() {
		// TODO Auto-generated constructor stub
		this.liste  = new ArrayList<Media>();
		
	}	
	/**
	 * Méthode pour ajouter une média dans la librierie
	 * @param media
	 */
	public void addMedia(Media media){
		this.liste.add(media);
	}
	
	public Media lastMedia(){
		return liste.get(liste.size() - 1);
	}
	
	public List<Media> listMedia(){
		return liste;
	}

	public List<Media> sortMedia(){
		Collections.sort(liste);
		return liste;
	}

}
