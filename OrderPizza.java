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
				System.out.println("����ʧ��~");
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
