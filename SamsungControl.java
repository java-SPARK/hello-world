package qiaojiemoshi;

public class SamsungControl implements Control {	@Override
	public void on() {
	// TODO 自动生成的方法存根
	System.out.println("Open Samsung TV");
}

@Override
public void off() {
	// TODO 自动生成的方法存根
	System.out.println("Close Samsung TV");
}

@Override
public void setchannel(int ch) {
	// TODO 自动生成的方法存根
	System.out.println("Samsung TV channel is setted "+ch);
}

@Override
public void setvolume(int vol) {
	// TODO 自动生成的方法存根
	System.out.println("Samsung TV volume is setted "+vol); 

	}

}
