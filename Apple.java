package fangwenzhemoshi;

public class Apple implements IProduct {

	@Override
	public void accpet(AVisitor vistor) {
		// TODO 自动生成的方法存根
		visitor.visit(this);
	}

}
