package danlimoshi;

public class Fruitstore {
	private static Fruitstore frusto;
	private Fruitstore() {};
	public static Fruitstore getstore(){
		if(frusto==null) {
			synchronized(Fruitstore.class) {
				if(frusto==null) {
					frusto=new Fruitstore();
				}
			}
		}
		return frusto;
	}
}
