package zhuangshizhemoshi;

public class ConcreteDecorator extends Decorator {

	public ConcreteDecorator(Component component) {
		super(component);
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public void operation() {
		// TODO �Զ����ɵķ������
		System.out.println("�������");
		component.operation();
	}

}
	