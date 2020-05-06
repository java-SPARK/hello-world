package jiandangongchangmoshi;

public class SimpleFactory {
	public Pizza createPizza(String ordertype) {
		Pizza pizza=null;
		if(ordertype.equals("greek")) {
			pizza=new Greek();
			pizza.setName("Ï£À°pizza");
		}else if(ordertype.equals("cheese")) {
			pizza=new Cheese();
			pizza.setName("ÄÌÀÒpizza");
	}else if(ordertype.equals("fruit")) {
		pizza=new Fruit();
		pizza.setName("Ë®¹ûpizza");
		}
		return pizza;
	}
}
