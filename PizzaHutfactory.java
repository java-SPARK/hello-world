package chouxianggongchang;

public class PizzaHutfactory implements AbsFactory {

	@Override
	public Pizza createpizza(String ordertype) {
		// TODO �Զ����ɵķ������
		Pizza pizza=null;
		if(ordertype.equals("greek")) {
			pizza=new PizzaHutgreek();
		}else if(ordertype.equals("cheese")) {
			pizza=new PizzaHutcheese();
		}
		return pizza;
	}

}
