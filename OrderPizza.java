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
				System.out.println("订购pizza失败！");
				break;
			}
		}while(true);	
	}
	public String gettype(){
		
		try {
		     BufferedReader string=new BufferedReader(new InputStreamReader(System.in));
		     System.out.println("选择pizza种类:");
		     String str = string.readLine();
		     return	 str;
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return "";
		}			
	}
}
