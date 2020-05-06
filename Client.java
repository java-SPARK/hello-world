package shipeiqimoshi;

public class Client {
	public static void main(String[] args) {
		System.out.println("ÀàÊÊÅäÆ÷"+new Adapter().power());
		Adapter1 ada=new Adapter1(new Adaptee());
		System.out.println("¶ÔÏóÊÊÅäÆ÷"+ada.power());
	}
}
