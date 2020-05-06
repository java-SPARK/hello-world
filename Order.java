package minglingmoshi;

import java.util.HashMap;

public class Order {
	private int id;
	private HashMap<String,Integer> fruitmap;  
	public Order() {
		fruitmap=new HashMap<String,Integer>();
	}

	public int getId() {
		// TODO 自动生成的方法存根
		return 0;
	}
	public void setId(int id) {
		this.id=id;
	}
	public HashMap<String,Integer> getfruitmap(){
		 return fruitmap;
	}
	public void setfruitmap(String fruitkind,int quantity ) {
		this.fruitmap.put(fruitkind, quantity);
	}
}
