package shipeiqimoshi;

public class Adapter extends Adaptee {
	int power() {
		return super.power()/10;
	}
}
