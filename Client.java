package diedaiqi;

public class Client {
	public static void main(String[] args) {
		MyList list =new ConcreteAggregate();
		list.add("Áõ±¸");
		list.add("¹ØÓğ");
		Iterator iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
