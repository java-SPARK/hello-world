package diedaiqi;

public class Client {
	public static void main(String[] args) {
		MyList list =new ConcreteAggregate();
		list.add("����");
		list.add("����");
		Iterator iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
