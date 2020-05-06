package jianzaozhemoshi;

public class Client {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Driector dri=new Driector();
		Human human=dri.createhumanBydriector(new SmartBuilder());
		System.out.println(human);
	}

}
