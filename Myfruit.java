package yuanxingmoshi;

public class Myfruit implements Cloneable {
	protected String kind;
	public void display()
	{
		System.out.println(kind);
	}
	public Object clone() {
		Object Obj=null;
		try {
			Obj=super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return Obj;
	}
}
