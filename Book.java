package fangwenzhemoshi;

public class Book implements IProduct {

	@Override
	public void accpet(AVisitor vistor) {
		// TODO �Զ����ɵķ������
		visitor.visit(this);
	}

}
