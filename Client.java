package yuanxingmoshi;

public class Client {
public static void main(String[] args) {
	Myfruit fru1=new Apple();
	Myfruit fru3=fru1;
	Myfruit fru2=(Apple)fru1.clone();
	fru1.display();
	fru2.display();
	fru3.display();
	System.out.println("fru1 "+fru1.hashCode());
	System.out.println("fru2 "+fru2.hashCode());
	System.out.println("fru3 "+fru3.hashCode());
}
}
