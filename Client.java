package minglingmoshi;

public class Client {
public static void main(String[] args) {
	Order order1=new Order();
	order1.setId(1);
	order1.setfruitmap("ƻ��", 1);
	order1.setfruitmap("��֦", 2);
	order1.setfruitmap("����", 3);
	Operator op=new Operator();
	OrderCommand cmd=new OrderCommand(op,order1);
	WaiterInvoker waiter=new WaiterInvoker();
	waiter.setcommand(cmd);
	waiter.orderup();
}
}
