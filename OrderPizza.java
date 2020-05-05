 package chouxianggongchang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
	AbsFactory factory;
	public OrderPizza(AbsFactory factory){
		setfactory(factory);
	}
	public void setfactory(AbsFactory factory) {
		Pizza pizza=null;
		String ordertype="";
		this.factory=factory;	
		do {
			ordertype=gettype();
			pizza=factory.createpizza(ordertype);
			if(pizza!=null) {
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
			}else {
				System.out.println("订购失败~");
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
