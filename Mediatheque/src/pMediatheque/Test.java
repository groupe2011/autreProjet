package pMediatheque;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Librairie lib1 = new Librairie();
		Livre livre1 = new Livre(0,"aventure",200);
		Livre livre2 = new Livre(1,"humour",200);
		Livre livre3 = new Livre(2,"action",200);
		lib1.addMedia(livre1);
		lib1.addMedia(livre2);
		lib1.addMedia(livre3);
		System.out.println("type : " + lib1.lastMedia().getType());
		for(Media media : lib1.listMedia()){
			System.out.println("type liste : " + media.getType());
		}
		
		for(Media media : lib1.sortMedia()){
			System.out.println("type liste trie : " + media.getType());
		}
	}
}
