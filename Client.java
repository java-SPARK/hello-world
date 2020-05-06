package zhuangshizhemoshi;

public class Client {
	public static void main(String[] args) {
		ConcreteDecorator code=new ConcreteDecorator(new ConcreteComponent());
		code.operation();
	}
}
