package guanchazhemoshi;

public class ForcastConditions implements Observer{
	private float mTemperatrue;
	private float mPressure;
	private float mHumidity;
	@Override
	public void update(float mTemperatrue, float mPressure, float mHumidity) {
		// TODO �Զ����ɵķ������
		this.mHumidity=mHumidity;
		this.mPressure=mPressure;
		this.mTemperatrue=mTemperatrue;
		display();
	}
	public void display() {
		System.out.println("**�����¶�:"+(mTemperatrue+Math.random()));
		System.out.println("**������ѹ:"+(mPressure+10*Math.random()));
		System.out.println("**����ʪ��:"+(mHumidity+Math.random()));
		}
	
}
