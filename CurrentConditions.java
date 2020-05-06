package guanchazhemoshi;

public class CurrentConditions implements Observer {
	private float mTemperatrue;
	private float mPressure;
	private float mHumidity;
	@Override
	public void update(float mTemperatrue, float mPressure, float mHumidity) {
		// TODO 自动生成的方法存根
		this.mHumidity=mHumidity;
		this.mPressure=mPressure;
		this.mTemperatrue=mTemperatrue;
	}
	public void display() {
		System.out.println("***Today mTemperatrue:"+mTemperatrue+"****");
		System.out.println("***Today mPressure:"+mPressure+"****");
		System.out.println("***Today mHumidity:"+mHumidity+"****");
	}
}
