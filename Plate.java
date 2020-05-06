	package zuhemoishi;

import java.util.ArrayList;

public class Plate extends MyElement {
	private ArrayList list=new ArrayList();
	public void add(MyElement element) {
		list.add(element);
	}
	public void delete(MyElement element){
		list.remove(element);
	}	
	@Override
	public void eat() {
		// TODO 自动生成的方法存根
		for(Object obj:list) {
			((MyElement)obj).eat();
		}
	}

}
