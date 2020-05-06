package zhizelianmoshi;

import java.util.ArrayList;
import java.util.List;

public abstract class Absort {
	private int weight;
	protected List<String> fruitbox;
	private Absort nextsort;
	public void getfruitbox() {
		System.out.println("weight:"+weight);
		System.out.println("¸öÊý"+fruitbox.size());
		for(String t:fruitbox) {
			System.out.print(t+",");
		}
		System.out.println(" ");
	}
	public void setnextsort(Absort nextsort) {
		this.nextsort=nextsort;
	}
	public Absort(int weight) {
		this.weight=weight;
		fruitbox=new ArrayList();
	}
	public void sendfruit(int weight,String fruit){
		if(this.weight<=weight) {
			pushbox(fruit);
		}else if(nextsort!=null) {
			nextsort.sendfruit(weight, fruit);
		}
	}
	abstract protected void pushbox(String fruit);
}
