package xiangyuanmoshi;

public class Onepiece extends Apiece {
	public Onepiece(String inkind) {
		super(inkind);
	}
	@Override
	public void play(int x, int y) {
		// TODO �Զ����ɵķ������
		System.out.println("��"+inkind+"�ӷ���("+x+","+y+")");
	}

}
