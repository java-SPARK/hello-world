package qiaojiemoshi;

public class SamsungTVcontrol extends SamsungControl implements TVcontrol {
	private static int ch=1;
	private static boolean bl=false;
	@Override
	public void Onoff() {
		// TODO 自动生成的方法存根
		if(bl) {
			bl=false;
			super.off();
		}else {
			bl=true;
			super.on();
		}
	}

	@Override
	public void nextChannel() {
		// TODO 自动生成的方法存根
		ch++;
		super.setchannel(ch);
	}

	@Override
	public void preChannel() {
		// TODO 自动生成的方法存根
		ch--;
		if(ch<=0) {
			ch=200;
		}
		super.setchannel(ch);
	}
}
