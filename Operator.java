package minglingmoshi;

public class Operator {

	public void markfruit(Order order) {
		// TODO �Զ����ɵķ������
		String str="";
		for(String key:order.getfruitmap().keySet()) {
			str+=key+order.getfruitmap().get(key).toString();
		}
		System.out.println("�ڰ����֭"+str);
	}

}
	