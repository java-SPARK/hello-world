package qiaojiemoshi;

public class LgControl implements Control {

	@Override
	public void on() {
		// TODO �Զ����ɵķ������
		System.out.println("Open Lg TV");
	}

	@Override
	public void off() {
		// TODO �Զ����ɵķ������
		System.out.println("Close Lg TV");
	}

	@Override
	public void setchannel(int ch) {
		// TODO �Զ����ɵķ������
		System.out.println("Lg TV channel is setted "+ch);
	}

	@Override
	public void setvolume(int vol) {
		// TODO �Զ����ɵķ������
		System.out.println("Lg TV volume is setted "+vol);
	}

}
