package jianzaozhemoshi;

public class Client {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Driector dri=new Driector();
		Human human=dri.createhumanBydriector(new SmartBuilder());
		System.out.println(human);
	}

}
