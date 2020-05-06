package fangwenzhemoshi;

public class Book implements IProduct {

	@Override
	public void accpet(AVisitor vistor) {
		// TODO 自动生成的方法存根
		visitor.visit(this);
	}

}
