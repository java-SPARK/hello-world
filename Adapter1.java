package shipeiqimoshi;

public class Adapter1 extends Adaptee {
	private Adaptee ada;
	public Adapter1(Adaptee ada ) {
		this.ada=ada;
	}
	int power() {
		return super.power()/10;
	} 
}
