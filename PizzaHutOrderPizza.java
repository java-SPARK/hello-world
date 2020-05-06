package gongchangfangfamoshi;

public class PizzaHutOrderPizza extends OrderPizza {

	@Override
	Pizza createpizza(String ordertype) {
		Pizza pizza=null;
		if(ordertype.equals("greek")) {
			pizza=new KFCgreek();
		}else if(ordertype.equals("cheese")) {
			pizza=new KFCcheese();
		}
		// TODO 自动生成的方法存根
		return pizza;
	}
}
