package qiaojiemoshi;

public class SamsungControl implements Control {	@Override
	public void on() {
	// TODO �Զ����ɵķ������
	System.out.println("Open Samsung TV");
}

@Override
public void off() {
	// TODO �Զ����ɵķ������
	System.out.println("Close Samsung TV");
}

@Override
public void setchannel(int ch) {
	// TODO �Զ����ɵķ������
	System.out.println("Samsung TV channel is setted "+ch);
}

@Override
public void setvolume(int vol) {
	// TODO �Զ����ɵķ������
	System.out.println("Samsung TV volume is setted "+vol); 

	}

}
