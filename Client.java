package danlimoshi;

public class Client {
	public static void main(String[] args) {
		Fruitstore fre1=Fruitstore.getstore();
		Fruitstore fre2=Fruitstore.getstore();
		System.out.println("fre1 "+fre1.hashCode());
		System.out.println("fre2 "+fre2.hashCode());
	}
}
