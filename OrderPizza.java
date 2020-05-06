package jiandangongchangmoshi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
	SimpleFactory simpleFactory;
	Pizza pizza=null;
	public  OrderPizza(SimpleFactory simpleFactory) {
		setFactory(simpleFactory);		
	}
	public void setFactory(SimpleFactory simpleFactory) {
		String ordertype="";
		do {
			ordertype=gettype(); 
			pizza=this.simpleFactory.createPizza(ordertype);
			if(pizza!=null) {
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			}else {
				System.out.println("����pizzaʧ�ܣ�");
				break;
			}
		}while(true);	
	}
	public String gettype(){
		
		try {
		     BufferedReader string=new BufferedReader(new InputStreamReader(System.in));
		     System.out.println("ѡ��pizza����:");
		     String str = string.readLine();
		     return	 str;
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
			return "";
		}			
	}
}
