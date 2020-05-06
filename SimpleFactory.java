package jiandangongchangmoshi;

public class SimpleFactory {
	public Pizza createPizza(String ordertype) {
		Pizza pizza=null;
		if(ordertype.equals("greek")) {
			pizza=new Greek();
			pizza.setName("ϣ��pizza");
		}else if(ordertype.equals("cheese")) {
			pizza=new Cheese();
			pizza.setName("����pizza");
	}else if(ordertype.equals("fruit")) {
		pizza=new Fruit();
		pizza.setName("ˮ��pizza");
		}
		return pizza;
	}
}
