package fangwenzhemoshi;

public class Saler extends AVisitor {

	@Override
	public void visit(Apple apple) {
		// TODO �Զ����ɵķ������
		System.out.println("����Ա"+name+"�տ�");
	}

	@Override
	public void visit(Book book) {
		// TODO �Զ����ɵķ��� ���
		System.out.println("����Ա"+name+"�տ�");
	}

}
