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
		// TODO 自动生成的方法存根
		System.out.println(order.getId()+"顾客的成品");
		receiver.markfruit(order);
	}

}
