package minglingmoshi;

public class OrderCommand implements Command {
	private Operator receiver;
	private Order order;
	public OrderCommand(Operator receiver,Order order) {
		 this.receiver=receiver;
		 this.order=order;
	}
	@Override
	public void execute() {
		// TODO �Զ����ɵķ������
		System.out.println(order.getId()+"�˿͵ĳ�Ʒ");
		receiver.markfruit(order);
	}

}
