package qiaojiemoshi;

public class LgControl implements Control {

	@Override
	public void on() {
		// TODO 自动生成的方法存根
		System.out.println("Open Lg TV");
	}

	@Override
	public void off() {
		// TODO 自动生成的方法存根
		System.out.println("Close Lg TV");
	}

	@Override
	public void setchannel(int ch) {
		// TODO 自动生成的方法存根
		System.out.println("Lg TV channel is setted "+ch);
	}

	@Override
	public void setvolume(int vol) {
		// TODO 自动生成的方法存根
		System.out.println("Lg TV volume is setted "+vol);
	}

}
