package xiangyuanmoshi;

public abstract class Apiece {
	protected String inkind;
	public Apiece(String inkind) {
		this.inkind=inkind;
	}
	public abstract void play(int x,int y) ;
}
