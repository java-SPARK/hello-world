package zhuangshizhemoshi;

public class ConcreteDecorator extends Decorator {

	public ConcreteDecorator(Component component) {
		super(component);
		// TODO 自动生成的构造函数存根
	}

	@Override
	public void operation() {
		// TODO 自动生成的方法存根
		System.out.println("添加美颜");
		component.operation();
	}

}
	