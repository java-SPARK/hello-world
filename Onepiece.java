package xiangyuanmoshi;

public class Onepiece extends Apiece {
	public Onepiece(String inkind) {
		super(inkind);
	}
	@Override
	public void play(int x, int y) {
		// TODO 自动生成的方法存根
		System.out.println("把"+inkind+"子放在("+x+","+y+")");
	}

}
