package qiaojiemoshi;

public class SamsungTVcontrol extends SamsungControl implements TVcontrol {
	private static int ch=1;
	private static boolean bl=false;
	@Override
	public void Onoff() {
		// TODO �Զ����ɵķ������
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
		// TODO �Զ����ɵķ������
		ch++;
		super.setchannel(ch);
	}

	@Override
	public void preChannel() {
		// TODO �Զ����ɵķ������
		ch--;
		if(ch<=0) {
			ch=200;
		}
		super.setchannel(ch);
	}
}
