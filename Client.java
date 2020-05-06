package zuhemoishi;

public class Client {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		MyElement obj1,obj2,obj3;
		Plate plate1,plate2,plate3;
		obj1=new Apple();
		obj2=new Banana();
		obj3=new Banana();
		plate1=new Plate();
		plate1.add(obj1);
		plate2=new Plate();
		plate2.add(obj2);
		plate2.add(obj3);
		plate3=new Plate();
		plate3.add(plate2);
		plate3.add(plate1);
		plate3.eat();
		System.out.println("-------");
		plate2.delete(obj3);
		plate3.eat();
	}

}
