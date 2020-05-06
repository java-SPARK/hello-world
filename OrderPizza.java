package gongchangfangfamoshi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import jiandangongchangmoshi.Cheese;
import jiandangongchangmoshi.Greek;
import jiandangongchangmoshi.SimpleFactory;

public abstract class OrderPizza {
	public OrderPizza(){
		Pizza pizza=null;
		String ordertype;
		do {
			ordertype=gettype(); 
			pizza=createpizza(ordertype);
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
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
	abstract Pizza createpizza(String ordertype) ;
}
