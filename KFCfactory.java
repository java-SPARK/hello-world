package chouxianggongchang;

public class KFCfactory implements AbsFactory {

	@Override
	public Pizza createpizza(String ordertype) {
		// TODO �Զ����ɵķ������
			Pizza pizza=null;
			if(ordertype.equals("greek")) {
				pizza=new KFCgreek();
			}else if(ordertype.equals("cheese")) {
				pizza=new KFCcheese();
			}
		return pizza;
	}

}
