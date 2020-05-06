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
		     System.out.println("选择pizza种类:");
		     String str = string.readLine();
		     return	 str;
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return "";
		}			
	}
	abstract Pizza createpizza(String ordertype) ;
}
