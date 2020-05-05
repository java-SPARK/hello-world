package chouxianggongchang;

public class PizzaHutfactory implements AbsFactory {

	@Override
	public Pizza createpizza(String ordertype) {
		// TODO 自动生成的方法存根
		Pizza pizza=null;
		if(ordertype.equals("greek")) {
			pizza=new PizzaHutgreek();
		}else if(ordertype.equals("cheese")) {
			pizza=new PizzaHutcheese();
		}
		return pizza;
	}

}
