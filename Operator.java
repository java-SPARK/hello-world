package minglingmoshi;

public class Operator {

	public void markfruit(Order order) {
		// TODO 自动生成的方法存根
		String str="";
		for(String key:order.getfruitmap().keySet()) {
			str+=key+order.getfruitmap().get(key).toString();
		}
		System.out.println("黑暗混合汁"+str);
	}

}
	